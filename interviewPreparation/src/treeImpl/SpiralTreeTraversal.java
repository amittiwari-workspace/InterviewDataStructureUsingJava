package treeImpl;

import java.util.Stack;
import trees.BinaryTreeNode;

public class SpiralTreeTraversal {

	private static BinaryTreeNode root;

	public static void main(String[] args) {
	
		root=BinaryTreeNode.createTree();
		spiralTreeTraversal(root);
	}

	private static void spiralTreeTraversal(BinaryTreeNode root) {
		
		Stack<BinaryTreeNode> stackOne=new Stack<BinaryTreeNode>();
		Stack<BinaryTreeNode> stackTwo=new Stack<BinaryTreeNode>();
		stackOne.push(root);
		while(stackOne!=null&&stackOne!=null)
		{
		if(root==null)return;
		while(stackOne!=null&&!stackOne.isEmpty())
		{
			BinaryTreeNode tempNode=stackOne.pop();
			System.out.print(tempNode.getData());
			if(tempNode.right!=null)stackTwo.push(tempNode.right);
			if(tempNode.left!=null)stackTwo.push(tempNode.left);
		}
		while(stackTwo!=null&&!stackTwo.isEmpty())
		{
			BinaryTreeNode tempNode=stackTwo.pop();
			System.out.print(tempNode.getData());	
			if(tempNode.left!=null)stackOne.push(tempNode.left);
			if(tempNode.right!=null)stackOne.push(tempNode.right);
		}
	}
	}
}
