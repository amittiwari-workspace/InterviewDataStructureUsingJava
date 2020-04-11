package treeImpl;

import java.util.LinkedList;
import trees.BinaryTreeNode;

public class LCAOfBinaryTree {

	private static BinaryTreeNode root;
	
	public static void main(String[] args) {
		
		root=BinaryTreeNode.createTree();
		System.out.println("LCS of the Nodes are: "+findLCAOfBT(root,7,9));

	}

	private static int findLCAOfBT(BinaryTreeNode root, int n1, int n2) {
		
		LinkedList<Integer> pathOne=new LinkedList<Integer>();
		LinkedList<Integer> pathTwo=new LinkedList<Integer>();
		
		/* Find root to node path for both values */
		if(!findPath(root,n1,pathOne)||!findPath(root,n2,pathTwo))
		{
            return -1;
		}
		
		/*
		 * Check for Ancestor based on both path list
		 */		
		
		int temp;
        for (temp = 0; temp < pathOne.size() && temp < pathTwo.size(); temp++) { 
            if (!pathOne.get(temp).equals(pathTwo.get(temp))) 
                break; 
        } 
  
        return pathOne.get(temp-1); 
		
	}
	private static boolean findPath(BinaryTreeNode root,int n1,LinkedList<Integer> pathOne) {
		
		if(root==null)return false;
		
		pathOne.add(root.getData());
		
		if(root.getData()==n1)return true;
	
		if(root.left!=null&&findPath(root.left, n1, pathOne))return true;
		
		if(root.right!=null&&findPath(root.right, n1, pathOne))return true;
		
		pathOne.remove(pathOne.size()-1);
		
		return false;
	}
}
