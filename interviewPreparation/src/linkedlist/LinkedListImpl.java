package linkedlist;

public class LinkedListImpl {
	
	public static LinkedListNode head;
	
	public static void main(String[] args) {
		
	head=LinkedListNode.createList();
	System.out.print("Create and Print LinkedList Data: ");
	LinkedListNode.printList(head);
	
	head=LinkedListNode.addNodeAtFront(head, 8);
	System.out.println();
	System.out.print("Add Node at Front of LinkedList: ");
	LinkedListNode.printList(head);
	
	LinkedListNode.addNodeInBetween(head, 6, 5);
	System.out.println();
	System.out.print("Add Node in Between of LinkedList: ");
	LinkedListNode.printList(head);
	
	LinkedListNode.addNodeAtEnd(head, 67);
	System.out.println();
	System.out.print("Add Node at End of LinkedList: ");
	LinkedListNode.printList(head);
	
	}

}
