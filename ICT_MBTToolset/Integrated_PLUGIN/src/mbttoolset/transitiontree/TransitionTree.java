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

import java.awt.Container;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

import org.abego.treelayout.TreeForTreeLayout;
import org.abego.treelayout.TreeLayout;
import org.abego.treelayout.util.DefaultConfiguration;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;

/**
 * Demonstrates how to use the {@link TreeLayout} to render a tree in a Swing
 * application.
 * <p>
 * Intentionally the sample code is kept simple. I.e. it does not include stuff
 * like anti-aliasing and other stuff one would add to make the output look
 * nice.
 * <p>
 * Screenshot:
 * <p>
 * <img src="doc-files/swingdemo.png" alt="A tree rendered using Swing">
 * 
 * @author Udo Borkowski (ub@abego.org)
 */
public class TransitionTree {

	public static void showInDialog(JComponent panel) {
		JDialog dialog = new JDialog();
		Container contentPane = dialog.getContentPane();
		((JComponent) contentPane).setBorder(BorderFactory.createEmptyBorder(
				10, 10, 10, 10));
		contentPane.add(panel);
		dialog.pack();
		String path = "icons/ictLogo.png";
		final URL fullPathString = FileLocator.find(Platform.getBundle("plug"), new Path(path), null);
		ImageIcon image = new ImageIcon(fullPathString);
		dialog.setIconImage(image.getImage());
		dialog.setTitle("Transition Tree");
		dialog.setLocationRelativeTo(null);
		dialog.toFront();
		dialog.requestFocus();
		dialog.setVisible(true);
	}

	public static TreeForTreeLayout<TextInBox> getTransitionTree(String treeName) {
		TreeForTreeLayout<TextInBox> tree;
		if (treeName.equals("Meeting")) {
			tree = TreeFactory.createSampleTree2();
		} else if (treeName.equals("Account")) {
			tree = TreeFactory.createSampleTree();
		}else /*if (treeName.equals("tt"))*/ {
			tree = TreeFactory.createTransitionTree3();
		}  /*else {
			throw new RuntimeException(String.format("Invalid tree name: '%s'",
					treeName));
		}*/
		return tree;
	}

	/**
	 * Shows a dialog with a tree in a layout created by {@link TreeLayout},
	 * using the Swing component {@link TextInBoxTreePane}.
	 * 
	 * @param args args[0]: treeName (default="")
	 */	
	public static void main(String[] args) {
		// get the sample tree
		String treeName = (args.length > 0) ? args[0] : "";
		TreeForTreeLayout<TextInBox> tree = getTransitionTree(treeName);
				
		// setup the tree layout configuration
		double gapBetweenLevels = 50;
		double gapBetweenNodes = 10;
		DefaultConfiguration<TextInBox> configuration = new DefaultConfiguration<TextInBox>(
				gapBetweenLevels, gapBetweenNodes,org.abego.treelayout.Configuration.Location.Left);

		// create the NodeExtentProvider for TextInBox nodes
		TextInBoxNodeExtentProvider nodeExtentProvider = new TextInBoxNodeExtentProvider();

		// create the layout
		TreeLayout<TextInBox> treeLayout = new TreeLayout<TextInBox>(tree,
				nodeExtentProvider, configuration);

		// Create a panel that draws the nodes and edges and show the panel
//		TextInBoxTreePane panel = new TextInBoxTreePane(treeLayout);
//		showInDialog(panel);
	}
}
