package treeImpl;

import trees.BinaryTreeNode;
import trees.TreeTraversalIterative;

public class TreeTraversalIterativeImpl {
	
	private static BinaryTreeNode root;
	
	public static void main(String[] args) {
		
		root=BinaryTreeNode.createTree();
		System.out.println("PreOrder Traversal Iterative");
		TreeTraversalIterative.preOrder(root);
		System.out.println();
		System.out.println("PostOrder Traversal Iterative");
		TreeTraversalIterative.postOrder(root);
		System.out.println();
		System.out.println("InOrder Traversal Iterative");
		TreeTraversalIterative.inOrder(root);
	}
}
