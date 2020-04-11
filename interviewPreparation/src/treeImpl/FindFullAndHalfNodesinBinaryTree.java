package treeImpl;

import trees.BinaryTreeNode;

public class FindFullAndHalfNodesinBinaryTree {

	private static BinaryTreeNode root;
	
	public static void main(String[] args) {
	
		root=BinaryTreeNode.createTree();
		System.out.println("Find Full Nodes Count Recursive: "+findfullNodesRecursive(root));
		System.out.println("Find Half Nodes Count Recursive: "+findHalfNodesRecursive(root));
		
	}

	private static int findfullNodesRecursive(BinaryTreeNode root) {
		
		int countOfFullNodes=0;
		
		if(root==null)return 0;
		
		if(root.left!=null&&root.right!=null)countOfFullNodes++;
		
		return countOfFullNodes+findfullNodesRecursive(root.left)+findfullNodesRecursive(root.right);
	}
	
	private static int findHalfNodesRecursive(BinaryTreeNode root) {
		
		int countOfHalfNodes=0;
		
		if(root==null)return 0;
		
		if(root.left==null&&root.right==null)countOfHalfNodes++;
		
		return countOfHalfNodes+findHalfNodesRecursive(root.left)+findHalfNodesRecursive(root.right);
	}

}
