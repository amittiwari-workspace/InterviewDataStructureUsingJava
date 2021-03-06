package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeTraversalIterative {
	
	public static void inOrder(BinaryTreeNode root)
	{
		Stack<BinaryTreeNode> stack=new Stack<BinaryTreeNode>();
		if (root==null) return;	
		BinaryTreeNode tempNode=root;
		while(tempNode!=null|| stack.size()>0) {
			while(tempNode!=null)	
			{
				stack.push(tempNode);
				tempNode=tempNode.left;
			}
			tempNode=stack.pop();
			System.out.print(tempNode.getData());
			tempNode=tempNode.right;	
		}
		
	}

	/* Root-Left-Right */
	public static void preOrder(BinaryTreeNode root) {
		
		Stack<BinaryTreeNode> stack=new Stack<BinaryTreeNode>();
		if(root==null) return;
		stack.push(root);
		
		while(!stack.isEmpty())
		{
			BinaryTreeNode tempNode=(BinaryTreeNode) stack.pop();
			System.out.print(tempNode.getData());
			if(tempNode.right!=null)
			{
				stack.push(tempNode.right);
			}
			if(tempNode.left!=null)
			{
				stack.push(tempNode.left);
			}	
		}
	}
	public static void postOrder(BinaryTreeNode root)
	{
		
		Stack<BinaryTreeNode> stackOne=new Stack<BinaryTreeNode>();
		Stack<BinaryTreeNode> stackTwo=new Stack<BinaryTreeNode>();
		
		if(root==null) return;
		stackOne.push(root);
		while(!stackOne.isEmpty())
		{
			BinaryTreeNode tempNode=stackOne.pop();
			stackTwo.add(tempNode);
			
			if(tempNode.left!=null)
			{
			stackOne.push(tempNode.left);	
			}
			if(tempNode.right!=null)
			{
				stackOne.push(tempNode.right);
			}
			
		}
		while(!stackTwo.isEmpty())
		{
			BinaryTreeNode resultTempNode=stackTwo.pop();
			System.out.print(resultTempNode.getData());
		}	
	}
	
	public static void levelOrderTraversal(BinaryTreeNode root)
	{
	 Queue<BinaryTreeNode> queue=new LinkedList<BinaryTreeNode>();
	 if(root==null)return;
	 queue.offer(root);
	 while(queue!=null&&!queue.isEmpty())
	 {
		 BinaryTreeNode tempNode=queue.poll();
		 System.out.print(tempNode.getData());
		 
		 if(tempNode.left!=null)
			 queue.offer(tempNode.left);
		 
		 if(tempNode.right!=null)
			 queue.offer(tempNode.right);	 
	 }
	}
}
