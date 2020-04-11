package treeImpl;

import java.util.LinkedList;
import java.util.Queue;
import trees.BinaryTreeNode;

public class FindMinMaxInBinaryTree {

	public static BinaryTreeNode root;
	public static void main(String[] args) {
		
		root=BinaryTreeNode.createTree();
		findMinMaxValueInTree(root);		
	}
	
	public static void findMinMaxValueInTree(BinaryTreeNode root)
	{
		int maxValue=Integer.MIN_VALUE;
		int minValue=Integer.MAX_VALUE;
		
		Queue<BinaryTreeNode> queue=new LinkedList<BinaryTreeNode>();
		
		if(root==null)return;
		
		queue.offer(root);
		
		while(queue!=null&&!queue.isEmpty())
		{
			BinaryTreeNode tempNode=queue.poll();
			
			if(tempNode.getData()>maxValue)maxValue=tempNode.getData();

			if(tempNode.getData()<minValue)minValue=tempNode.getData();
				
			if(tempNode.left!=null)queue.offer(tempNode.left);
				
			if(tempNode.right!=null)queue.offer(tempNode.right);
				
		}
		System.out.println("Max Value of Node in Tree: "+maxValue+" Min Value of Node in Tree: "+minValue);
	}


}
