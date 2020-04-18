package linkedlist;

public class ReverseLinkedList {

	public static LinkedListNode head;
	
	public static void main(String[] args) {
		
		head=LinkedListNode.createList();
		System.out.print("Before Reversal: ");
		LinkedListNode.printList(head);
		head=reverseListIteratively(head);
		System.out.println();
		System.out.print("After Reversal: ");
		LinkedListNode.printList(head);

	}

	private static LinkedListNode reverseListIteratively(LinkedListNode head) {
		
		if(head==null)return null;
		
		LinkedListNode currentNode=head;
		LinkedListNode previousNode=null;
		LinkedListNode nextNode=null;
		while(currentNode!=null) {
			
			nextNode=currentNode.next;
			currentNode.next=previousNode;
			previousNode=currentNode;
			currentNode=nextNode;
		}
		head=previousNode;
		return head;
	}
}
