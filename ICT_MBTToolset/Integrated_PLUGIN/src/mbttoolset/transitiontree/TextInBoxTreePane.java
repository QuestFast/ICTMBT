/*
 * [The "BSD license"]
 * Copyright (c) 2011, abego Software GmbH, Germany (http://www.abego.org)
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions are met:
 * 
 * 1. Redistributions of source code must retain the above copyright notice, 
 *    this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice, 
 *    this list of conditions and the following disclaimer in the documentation 
 *    and/or other materials provided with the distribution.
 * 3. Neither the name of the abego Software GmbH nor the names of its 
 *    contributors may be used to endorse or promote products derived from this 
 *    software without specific prior written permission.
 *    
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE 
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE 
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR 
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS 
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
 * POSSIBILITY OF SUCH DAMAGE.
 */
package mbttoolset.transitiontree;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;

import javax.swing.JComponent;

import org.abego.treelayout.TreeForTreeLayout;
import org.abego.treelayout.TreeLayout;
import org.eclipse.jface.dialogs.MessageDialog;

/**
 * A JComponent displaying a tree of TextInBoxes, given by a {@link TreeLayout}.
 * 
 * @author Udo Borkowski (ub@abego.org)
 */
public class TextInBoxTreePane extends JComponent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int maxY = 0;
	private Hashtable<Integer, ArrayList<String>> actionsWithTransitionNo = new Hashtable<Integer, ArrayList<String>>();
	
	private Hashtable<String, ArrayList<String>> transitionsWithActions = new Hashtable<String, ArrayList<String>>();
	public static boolean missingActions=false;
	public void setTransitionsWithActions(Hashtable<String, ArrayList<String>> transitionsWithActions) {
		this.transitionsWithActions = transitionsWithActions;
	}

	private final TreeLayout<TextInBox> treeLayout;

	private TreeForTreeLayout<TextInBox> getTree() {
		return treeLayout.getTree();
	}

	private Iterable<TextInBox> getChildren(TextInBox parent) {
		return getTree().getChildren(parent);
	}

	private Rectangle2D.Double getBoundsOfNode(TextInBox node) {
		return treeLayout.getNodeBounds().get(node);
	}

	/**
	 * Specifies the tree to be displayed by passing in a {@link TreeLayout} for
	 * that tree.
	 * 
	 * @param treeLayout the {@link TreeLayout} to be displayed
	 */
	public TextInBoxTreePane(TreeLayout<TextInBox> treeLayout,int count) {
		this.treeLayout = treeLayout;

		Dimension size = treeLayout.getBounds().getBounds().getSize();
//		FontMetrics m = getFontMetrics(getFont());
		size.height = (int) size.getHeight()+(count*20);
		setPreferredSize(size);
	}

	// -------------------------------------------------------------------
	// painting

	private final static int ARC_SIZE = 10;
	private final static Color BOX_COLOR = new Color(168, 212, 255);
	private final static Color BORDER_COLOR = Color.darkGray;
	private final static Color TEXT_COLOR = Color.black;
	private int count=1;
	
	private void paintEdges(Graphics g, TextInBox parent) {
		if (!getTree().isLeaf(parent)) {
			Rectangle2D.Double b1 = getBoundsOfNode(parent);
			double x1 = b1.getCenterX();
			double y1 = b1.getCenterY();
			for (TextInBox child : getChildren(parent)) {
				Rectangle2D.Double b2 = getBoundsOfNode(child);
				g.drawLine((int) x1, (int) y1, (int) b2.getCenterX(),
						(int) b2.getCenterY());
				
				int midX = ((int) x1+(int) b2.getCenterX())/2;
				int midY = ((int) y1+(int) b2.getCenterY())/2;
				
				String key = getKey(parent.getText(), child.getText());
				if(key != null){
				ArrayList<String>actions = transitionsWithActions.get(key);
				actionsWithTransitionNo.put(count, actions);
//				int midX = (int)b1.getMaxX();
//				int midY = (int)b1.getMaxY();
				g.drawString(Integer.toString(count), midX,midY);
				++count;
				paintEdges(g, child);
				}
				else
					missingActions = true;
			}
		}
	}
	
	private String getKey(String parent,String child){
		String desiredKey = null;
		Set<String> keys = transitionsWithActions.keySet();
		for(String key:keys){
			if(key.contains("#")){
				String[] parts = key.split("#");
				if(parts[0].trim().equals(parent) && parts[1].trim().equals(child)){
					desiredKey = key;
					break;
				}
			}
		}
		return desiredKey;
	}

	private void paintBox(Graphics g, TextInBox textInBox) {
		// draw the box in the background
		g.setColor(BOX_COLOR);
		Rectangle2D.Double box = getBoundsOfNode(textInBox);
		g.fillRoundRect((int) box.x, (int) box.y, (int) box.width - 1,
				(int) box.height - 1, ARC_SIZE, ARC_SIZE);
		g.setColor(BORDER_COLOR);
		g.drawRoundRect((int) box.x, (int) box.y, (int) box.width - 1,
				(int) box.height - 1, ARC_SIZE, ARC_SIZE);

		// draw the text on top of the box (possibly multiple lines)
		g.setColor(TEXT_COLOR);
		String[] lines = textInBox.text.split("\n");
		FontMetrics m = getFontMetrics(getFont());
		int x = (int) box.x + ARC_SIZE / 2;
		int y = (int) box.y + m.getAscent() + m.getLeading() + 1;
		for (int i = 0; i < lines.length; i++) {
			g.drawString(lines[i], x, y);
			y += m.getHeight();
			if(y>maxY)
				maxY = y;
		}
	}
	
	private void paintBoxForActions(Graphics g) {
		g.setColor(TEXT_COLOR);
		FontMetrics m = getFontMetrics(getFont());
		
		int x = 10;
		int y = maxY+20;
		for(int i=1;i<count;i++){
			ArrayList<String>actions = actionsWithTransitionNo.get(i);
			String line = i+" = ";
			for(int j=0;j<actions.size();j++){
				String action = actions.get(j);
				if(j < actions.size()-1)
					line += action + " , ";
				else
					line += action;
			}
			g.drawString(line, x, y);
			y += m.getHeight();
		}
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		count=1;
		paintEdges(g, getTree().getRoot());

		// paint the boxes
		for (TextInBox textInBox : treeLayout.getNodeBounds().keySet()) {
			paintBox(g, textInBox);
		}

//		System.err.println(actionsWithTransitionNo);
		paintBoxForActions(g);
	}
}