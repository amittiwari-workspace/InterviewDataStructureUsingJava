package linkedlist;

public class DetectLoopInLinkedList {

	public static LinkedListNode head;
	
	public static void main(String[] args) {
		
		head=LinkedListNode.createList();
		
		/* Creating a loop in list */
		head.next.next.next.next.next.next.next.next.next=head.next;
		
		System.out.println(detectLoopInList(head));
	}
	
	private static boolean detectLoopInList(LinkedListNode head)
	{
		if(head==null)return false;
		
		LinkedListNode slowPtr=head;
		LinkedListNode fastPtr=head.next;
		
		while(fastPtr!=null) {
			if(slowPtr==fastPtr||fastPtr.next==slowPtr)
			{
				System.out.println("Loop Detected at Node in LinkedList: "+slowPtr.getData());
				return true;
				
			}
			slowPtr=slowPtr.next;
			if(fastPtr.next!=null)
				fastPtr=fastPtr.next.next;
			else
				break;	
		}
		return false;
	}
}
