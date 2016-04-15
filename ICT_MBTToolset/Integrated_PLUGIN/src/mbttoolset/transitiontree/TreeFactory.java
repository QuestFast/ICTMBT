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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;

import org.abego.treelayout.TreeForTreeLayout;
import org.abego.treelayout.util.DefaultTreeForTreeLayout;

/**
 * Creates "Sample" trees, e.g. to be used in demonstrations.
 * 
 * @author Udo Borkowski (ub@abego.org)
 */
public class TreeFactory {

	public static ArrayList<String[]> transitionTreeElements = new ArrayList<String[]>();

	/**
	 * @return a "Sample" tree with {@link TextInBox} items as nodes.
	 */
	public static TreeForTreeLayout<TextInBox> createSampleTree() {
		TextInBox root = new TextInBox("initialized", 60, 22);
		TextInBox n1 = new TextInBox("active", 50, 22);
		TextInBox n1_1 = new TextInBox("active", 50, 22);
		TextInBox n1_2 = new TextInBox("inactive", 60, 22);
		TextInBox n1_1a = new TextInBox("active", 50, 22);

		DefaultTreeForTreeLayout<TextInBox> tree = new DefaultTreeForTreeLayout<TextInBox>(
				root);
		tree.addChild(root, n1);
		tree.addChild(n1, n1_1);
		tree.addChild(n1, n1_2);
		tree.addChild(n1_2, n1_1a);
		return tree;
	}

	public static TreeForTreeLayout<TextInBox> createTransitionTree() {
		TextInBox root = null;
		DefaultTreeForTreeLayout<TextInBox> tree = null;
		if(!transitionTreeElements.isEmpty()){
			String[] firstPath = transitionTreeElements.get(0);
			String rootStr = firstPath[0];
			root = new TextInBox(rootStr, rootStr.length()*7, 22);
			tree = new DefaultTreeForTreeLayout<TextInBox>(root);
			List<String> doneElems = new ArrayList<String>();
			Hashtable<Integer, ArrayList<TextInBox>> levelWiseElems = new Hashtable<Integer, ArrayList<TextInBox>>();
			//			int i=1;
			int level = 1;
			//			for(String[] path: transitionTreeElements){
			ArrayList<TextInBox> doneBoxes = new ArrayList<TextInBox>();
			for(int i=level;i<transitionTreeElements.size();i++){
				ArrayList<TextInBox> previousBoxes = levelWiseElems.get(level-1); 
				for(String[] path: transitionTreeElements){
					//					for(int j=0;j<path.length;j++){
					if(i<path.length){
						String elem = path[i];
						//							int freq = Collections.frequency(doneElems,elem);
						if(!doneElems.contains(elem) && elem != null){
							doneElems.add(elem);
							if(i==1){
								TextInBox n1 = new TextInBox(elem, elem.length()*5, 20);
								tree.addChild(root, n1);
								doneBoxes.add(n1);
							}
							else{
								ArrayList<TextInBox> tempdoneBoxes = new ArrayList<TextInBox>();
								if(level==1)
									tempdoneBoxes.addAll(doneBoxes);
								else
									tempdoneBoxes.addAll(previousBoxes);
								for(int k=0;k<tempdoneBoxes.size();k++){
									TextInBox box = null;
									if(level==1)
										box = doneBoxes.get(k);
									else
										box = previousBoxes.get(k);
									if(path[i-1].equals(box.getText())){
										TextInBox n1 = new TextInBox(elem, elem.length()*5, 20);
										tree.addChild(box, n1);
										doneBoxes.add(n1);
									}
								}

							}
						}
						else if(doneElems.contains(elem) && elem != null){
							int freq = Collections.frequency(doneElems,elem);
							if(freq<2 && previousBoxes != null && elem != null){
								doneElems.add(elem);
								ArrayList<TextInBox> tempdoneBoxes = new ArrayList<TextInBox>();
								if(level==1)
									tempdoneBoxes.addAll(doneBoxes);
								else
									tempdoneBoxes.addAll(previousBoxes);
								for(int k=0;k<tempdoneBoxes.size();k++){
									TextInBox box = null;
									if(level==1)
										box = doneBoxes.get(k);
									else
										box = previousBoxes.get(k);
									if(path[i-1].equals(box.getText())){
										TextInBox n1 = new TextInBox(elem, elem.length()*5, 20);
										tree.addChild(box, n1);
										doneBoxes.add(n1);
									}
								}
							}
						}
					}
					//					}
					//					System.out.println();
				}
				levelWiseElems.put(level, doneBoxes);
				++level;
			}
		}

		//		TextInBox root = new TextInBox("root", 40, 20);
		//		TextInBox n1 = new TextInBox("n1", 30, 20);
		//		TextInBox n1_1 = new TextInBox("n1.1\n(first node)", 80, 36);
		//		TextInBox n1_2 = new TextInBox("n1.2", 40, 20);
		//		TextInBox n1_3 = new TextInBox("n1.3\n(last node)", 80, 36);
		//		TextInBox n2 = new TextInBox("n2", 30, 20);
		//		TextInBox n2_1 = new TextInBox("n2", 30, 20);

		//		DefaultTreeForTreeLayout<TextInBox> tree = new DefaultTreeForTreeLayout<TextInBox>(
		//				root);
		//		tree.addChild(root, n1);
		//		tree.addChild(n1, n1_1);
		//		tree.addChild(n1, n1_2);
		//		tree.addChild(n1, n1_3);
		//		tree.addChild(root, n2);
		//		tree.addChild(n2, n2_1);
		return tree;
	}

	public static TreeForTreeLayout<TextInBox> createTransitionTree3() {
		TextInBox root = null;
		Hashtable<Integer, ArrayList<String>> nodesAtLevel = new Hashtable<Integer, ArrayList<String>>();
		DefaultTreeForTreeLayout<TextInBox> tree = null;
		if(!transitionTreeElements.isEmpty()){
			String[] firstPath = transitionTreeElements.get(0);
			String rootStr = firstPath[0];
			root = new TextInBox(rootStr, rootStr.length()*7, 22);
			tree = new DefaultTreeForTreeLayout<TextInBox>(root);
			for(int i=1;i<transitionTreeElements.size();i++){
				ArrayList<String> nodes = new ArrayList<String>();
				for(String[] path: transitionTreeElements){
					if(i<path.length){
						if(!nodes.contains(path[i])){
							nodes.add(path[i]);
						}
					}
				}
				if(!nodes.isEmpty())
					nodesAtLevel.put(i, nodes);
			}
			ArrayList<String> endNodes = new ArrayList<>();
			for(int i=1;i<transitionTreeElements.size();i++){
				ArrayList<String> nodes = nodesAtLevel.get(i);
				if(nodes.size()==1 && nodes.get(0)==null){
					endNodes.addAll(nodesAtLevel.get(i-1));
					break;
				} 
			}
			
			Hashtable<Integer, ArrayList<TextInBox>> treeNodesAtLevel = new Hashtable<Integer, ArrayList<TextInBox>>();
			List<String> doneNodes = new ArrayList<String>();
			for(int i=1;i<transitionTreeElements.size();i++){
				ArrayList<String> nodes = nodesAtLevel.get(i);
				if(nodes != null){
					ArrayList<TextInBox> treeNodes = new ArrayList<>();
					for(String node: nodes){
						if(!doneNodes.contains(node) && i==1 && node != null){
							TextInBox n1 = new TextInBox(node, node.length()*7, 20);
							tree.addChild(root, n1);
							treeNodes.add(n1);
							doneNodes.add(node);
						}
						else{
							if (node != null){
//								int freq = Collections.frequency(doneNodes,node);
//								if(freq < 2){
									ArrayList<TextInBox> treeChildNodes = treeNodesAtLevel.get(i-1);
									ArrayList<TextInBox> tempNodes = new ArrayList<>();
									tempNodes.addAll(treeChildNodes);
									for(TextInBox box: tempNodes){
										if(!endNodes.contains(box.getText())){
										int count = countSimilarParents(box,box,tree);
										if(count<2){
											TextInBox n1 = new TextInBox(node, node.length()*7, 20);
											tree.addChild(treeChildNodes.get(treeChildNodes.indexOf(box)), n1);
											treeNodes.add(n1);
										}
										}
									}
//								}
								doneNodes.add(node);
							}
						}
					}
					treeNodesAtLevel.put(i, treeNodes);
				}
			}
		}
		return tree;
	}
	static List<String> parents = new ArrayList<>();
	private static int countSimilarParents(TextInBox ibox,TextInBox box,DefaultTreeForTreeLayout<TextInBox> tree) {
		int count=0;
		TextInBox parent = tree.getParent(box);
		if(parent != null){
			parents.add(parent.getText());
			countSimilarParents(box,parent,tree);
		}
		count = Collections.frequency(parents, ibox.getText());
		return count;
	}

	/**
	 * @return a "Sample" tree with {@link TextInBox} items as nodes.
	 */
	public static TreeForTreeLayout<TextInBox> createSampleTree2() {
		TextInBox root = new TextInBox("Start", 40, 22);
		TextInBox n1 = new TextInBox("Presentation", 75, 22);
		TextInBox n1_1 = new TextInBox("Demo", 40, 22);
		TextInBox n1_2 = new TextInBox("Presentation", 75, 22);
		TextInBox n1_1a = new TextInBox("Discussion", 65, 22);
		TextInBox n1_2a = new TextInBox("Demo", 75, 22);

		TextInBox n1_1a1 = new TextInBox("QuestionAnswerSession", 125, 22);
		TextInBox n1_1a2 = new TextInBox("Suspend", 55, 22);

		TextInBox n1_1a1a = new TextInBox("ConcludingSession", 105, 22);
		TextInBox n1_1a1b = new TextInBox("Suspend", 55, 22);

		TextInBox end = new TextInBox("End", 40, 22);
		TextInBox end1 = new TextInBox("End", 40, 22);

		DefaultTreeForTreeLayout<TextInBox> tree = new DefaultTreeForTreeLayout<TextInBox>(
				root);
		tree.addChild(root, n1);
		tree.addChild(n1, n1_1);
		tree.addChild(n1, n1_2);
		tree.addChild(n1_1, n1_1a);
		tree.addChild(n1_2, n1_2a);
		tree.addChild(n1_1a, n1_1a1);
		tree.addChild(n1_1a, n1_1a2);
		tree.addChild(n1_1a1, n1_1a1a);
		tree.addChild(n1_1a1, n1_1a1b);
		tree.addChild(n1_1a1a, end);
//		tree.addChild(n1_1a1b, end1);
		return tree;
	}
}
