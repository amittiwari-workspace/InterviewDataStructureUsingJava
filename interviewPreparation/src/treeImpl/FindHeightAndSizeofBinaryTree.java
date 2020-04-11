package treeImpl;

import java.util.LinkedList;
import java.util.Queue;

import trees.BinaryTreeNode;

public class FindHeightAndSizeofBinaryTree {
	
	private static BinaryTreeNode root;
	public static void main(String[] args) {
		
		root=BinaryTreeNode.createTree();
		System.out.println("Height of Binary Tree: "+findHeightofTree(root));
		System.out.println("Size of Binary Tree: "+findSizeofBinaryTree(root));
	}
	private static int findHeightofTree(BinaryTreeNode root) {
		if(root==null)return 0;
		else
		{
			int leftHeight=findHeightofTree(root.left);
			int rightHeight=findHeightofTree(root.right);
			
			if(leftHeight>rightHeight)
				return leftHeight=leftHeight+1;
			else 
				return rightHeight=rightHeight+1;	
		}
		
	}
	private static int findSizeofBinaryTree(BinaryTreeNode root) {
		int sizeofTree=0;
		if(root==null)return 0;
		Queue<BinaryTreeNode> queue=new LinkedList<BinaryTreeNode>();
		queue.offer(root);
		
		while(queue!=null&&!queue.isEmpty())
		{
			BinaryTreeNode tempNode=queue.poll();
			sizeofTree++;
			if(tempNode.left!=null)queue.offer(tempNode.left);
			if(tempNode.right!=null)queue.offer(tempNode.right);
		}
		return sizeofTree;
	}
}
