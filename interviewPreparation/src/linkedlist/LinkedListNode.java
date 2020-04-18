package linkedlist;

public class LinkedListNode {
	
	private int data;
	public LinkedListNode next;
	
	public LinkedListNode(int data) {
		this.data=data;
		this.next=null;	
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}

	public static LinkedListNode createList() {
		LinkedListNode root;
		root=new LinkedListNode(5);
		root.next=new LinkedListNode(7);
		root.next.next=new LinkedListNode(4);
		root.next.next.next=new LinkedListNode(1);
		root.next.next.next.next=new LinkedListNode(8);
		root.next.next.next.next.next=new LinkedListNode(76);
		root.next.next.next.next.next.next=new LinkedListNode(3);
		root.next.next.next.next.next.next.next=new LinkedListNode(0);
		root.next.next.next.next.next.next.next.next=new LinkedListNode(-7);
		root.next.next.next.next.next.next.next.next.next=new LinkedListNode(45);
		return root;
		}
	
	public static void printList(LinkedListNode root)	
	{
		LinkedListNode temp=root;
		while(temp!=null)
		{
			System.out.print(" "+temp.data);
			temp=temp.next;
		}	
	}

	
	public static LinkedListNode addNodeAtFront(LinkedListNode head,int data)
	{
		LinkedListNode newNode=new LinkedListNode(data);
		newNode.next=head;
		head=newNode;
		return head;
	}
	
	public static void addNodeInBetween(LinkedListNode head,int data,int nodeData)
	{
		LinkedListNode tempNode=head;
		LinkedListNode newNode=new LinkedListNode(data);
		if(tempNode==null)
		{
			System.out.println("It is a Empty LinkedList");
		}
		else
		{
			while(tempNode.getData()!=nodeData) {
				tempNode=tempNode.next;
			}
			newNode.next=tempNode.next;
			tempNode.next=newNode;
		}
		return;
	}
	
	public static void addNodeAtEnd(LinkedListNode head,int data)
	{
		LinkedListNode newNode=new LinkedListNode(data);
		LinkedListNode tempNode=head;
		
		while(tempNode.next!=null)
		{
			tempNode=tempNode.next;
		}
		tempNode.next=newNode;
		newNode.next=null;
	}
}
