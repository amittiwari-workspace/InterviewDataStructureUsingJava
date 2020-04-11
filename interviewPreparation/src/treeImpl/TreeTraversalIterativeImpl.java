package treeImpl;

import trees.BinaryTreeNode;
import trees.TreeTraversalIterative;

public class TreeTraversalIterativeImpl {
	
	private static BinaryTreeNode root;
	
	public static void main(String[] args) {
		
		root=BinaryTreeNode.createTree();
		TreeTraversalIterative.preOrder(root);
		System.out.println();
		TreeTraversalIterative.postOrder(root);
	}

}
