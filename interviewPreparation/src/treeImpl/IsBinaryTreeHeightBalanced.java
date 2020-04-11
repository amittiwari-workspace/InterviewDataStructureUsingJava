package treeImpl;

import trees.BinaryTreeNode;

public class IsBinaryTreeHeightBalanced {

	private static BinaryTreeNode root;
	
	public static void main(String[] args) {
		
		root=BinaryTreeNode.createTree();
		System.out.println("Is Tree Balanced: "+isTreeHeightBalanced(root));
	
	}

	private static boolean isTreeHeightBalanced(BinaryTreeNode root) {
		
		if(root==null)return true;
		
		int leftHeight;
		int rightHeight;
		
		leftHeight=height(root.left);
		rightHeight=height(root.right);
		
		if(Math.abs(leftHeight-rightHeight)<=1&&isTreeHeightBalanced(root.left)
				&&isTreeHeightBalanced(root.right))
		{
			return true;
		}
		return false;
	}
	private static int height(BinaryTreeNode root) {
		
		if(root==null) return 0;
		else return 1+Math.max(height(root.left),height(root.right));
	}

}
