package treeImpl;

import java.util.LinkedList;
import java.util.Queue;
import trees.BinaryTreeNode;

public class SumAllNodeValueofTree {
	
	private static BinaryTreeNode root;
	private static int sumValuesofTree(BinaryTreeNode root)
	{
		int sum=0;
		Queue<BinaryTreeNode> queue=new LinkedList<BinaryTreeNode>();
		if(root==null)return sum;
		queue.offer(root);
		while(queue!=null&&!queue.isEmpty())
		{
			BinaryTreeNode tempNode=queue.poll();
			sum+=tempNode.getData();
			if(tempNode.left!=null)
			{
				queue.offer(tempNode.left);
			}
			if(tempNode.right!=null)
			{
				queue.offer(tempNode.right);
			}
		}
		return sum;	
	}
	
	public static void main(String[] args) {
		
		root=BinaryTreeNode.createTree();
		System.out.println("Sum of All Nodes of Binary Tree: "+sumValuesofTree(root));
	}
}
