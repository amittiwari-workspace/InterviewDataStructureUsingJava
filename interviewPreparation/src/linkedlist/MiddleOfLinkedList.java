package linkedlist;

public class MiddleOfLinkedList {

	public static LinkedListNode head;
	
	public static void main(String[] args) {
		
		head=LinkedListNode.createList();
		findMiddleOfList(head);
		System.out.print("Linked List is: ");
		LinkedListNode.printList(head);
		
	}
	
	private static void findMiddleOfList(LinkedListNode head)
	{
		if(head==null||head.next==null)
		{
			System.out.println("Linked List is Empty or Null");
			return;
		}	
		LinkedListNode slowPtr=head;
		LinkedListNode fastPtr=head.next;
		
		while(fastPtr!=null&&fastPtr.next!=null)
		{
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next.next;
		}
		System.out.println("Middle of Linked List is : "+slowPtr.getData());
		
	}
}
