package trees;

import treeImpl.TreeTraversalRecursionImpl;

public class BinaryTreeNode {
	
	private int data;
	public BinaryTreeNode left,right;
	
	public BinaryTreeNode(int data) {
		this.data=data;
		left=right=null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "BinaryTreeNode [data=" + data + ", left=" + left + ", right=" + right + "]";
	}
	
	 public static BinaryTreeNode createTree() {
		 
		 	BinaryTreeNode root=null;
			root=new BinaryTreeNode(5);
			root.left=new BinaryTreeNode(6);
			root.right=new BinaryTreeNode(7);
			root.left.left=new BinaryTreeNode(8);
			root.left.right=new BinaryTreeNode(9);
			root.left.left.left=new BinaryTreeNode(10);
			return root;
	 }
}
