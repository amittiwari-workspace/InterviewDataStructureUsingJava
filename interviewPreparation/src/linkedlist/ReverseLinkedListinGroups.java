package linkedlist;

public class ReverseLinkedListinGroups {

	public static LinkedListNode head;
	
	public static void main(String[] args) {
		
		head=LinkedListNode.createList();
		System.out.println("Before Reversing the List");
		LinkedListNode.printList(head);
		head=reverseListInGroups(head,3);
		System.out.println();
		System.out.print("After Reversing Linked list");
		LinkedListNode.printList(head);

	}

	private static LinkedListNode reverseListInGroups(LinkedListNode head, int groupSize) {
		
		LinkedListNode currentNode=head;
		LinkedListNode previousNode=null;
		LinkedListNode nextNode=null;
		
		int count=0;
		while(currentNode!=null&&count<groupSize)
		{
			nextNode=currentNode.next;
			currentNode.next=previousNode;
			previousNode=currentNode;
			currentNode=nextNode;
			count++;
		}
		/* recursive call to remaining nodes */
		if(nextNode!=null)head.next=reverseListInGroups(nextNode, 3);
		
		return previousNode;
	}
}
