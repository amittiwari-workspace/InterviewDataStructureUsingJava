package trees;

public class TreeTraversalRecursion {

	/* Left-Root-Right */
	public static void inOrder(BinaryTreeNode root)
	{
		if(root==null)
			return;
		
		inOrder(root.left);
		System.out.print(root.getData());
		inOrder(root.right);
		
		
	}

	/* Root-Left-Right */
	public  static void preOrder(BinaryTreeNode root)
	{
		if(root==null)
			return;
		System.out.print(root.getData());
		preOrder(root.left);
		preOrder(root.right);
		
		
	}
	
	/* Left-Right-Root */
	public static void postOrder(BinaryTreeNode root)
	{
		if(root==null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.getData());
		
	}

}
