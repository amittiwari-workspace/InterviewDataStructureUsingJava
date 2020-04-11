package treeImpl;

import trees.BinaryTreeNode;

public class LeftAndRightViewOfBinaryTree {

	private static BinaryTreeNode root;
	static int previouslevel=0;
	
	public static void main(String[] args) {
		
		root=BinaryTreeNode.createTree();
		leftViewOfBinaryTree(root,previouslevel+1);
		System.out.println();
		rightViewOfBinaryTree(root,previouslevel+1);
	}
	
	private static void leftViewOfBinaryTree(BinaryTreeNode root,int nextLevel)
	{
		if(root==null)return;
		if(previouslevel<nextLevel)
		{
			System.out.print(root.getData()+" ");
			previouslevel=nextLevel;
		}
		leftViewOfBinaryTree(root.left,nextLevel+1);
		leftViewOfBinaryTree(root.right,nextLevel+1);	
	}
	
	private static void rightViewOfBinaryTree(BinaryTreeNode root,int nextLevel)
	{
		if(root==null)return;
		if(previouslevel<nextLevel)
		{
			System.out.print(root.getData()+" ");
			previouslevel=nextLevel;
		}
		rightViewOfBinaryTree(root.right,nextLevel+1);
		rightViewOfBinaryTree(root.left,nextLevel+1);	
	}
}
