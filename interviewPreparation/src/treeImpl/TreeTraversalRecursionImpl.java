package treeImpl;

import trees.BinaryTreeNode;
import trees.TreeTraversalRecursion;

public class TreeTraversalRecursionImpl {

	public static BinaryTreeNode root;
	public static void main(String[] args) {
		
		root=BinaryTreeNode.createTree();
		
		System.out.println("InOrder Traversal");
		TreeTraversalRecursion.inOrder(root);
		System.out.println();	
		System.out.println("PreOrder Traversal");
		TreeTraversalRecursion.preOrder(root);
		System.out.println();
		System.out.println("PostOrder Traversal");
		TreeTraversalRecursion.postOrder(root);
				
	}

}
