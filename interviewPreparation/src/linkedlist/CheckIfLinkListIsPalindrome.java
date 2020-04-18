package linkedlist;

import java.util.Stack;

public class CheckIfLinkListIsPalindrome {

	public static LinkedListNode head;
	
	public static void main(String[] args) {
		head=LinkedListNode.createList();
		Stack<Integer> stack=new Stack<Integer>();
		System.out.println("Is Linked List Palindrome: "+checkForPalindrome(head,stack));
	}

	private static boolean checkForPalindrome(LinkedListNode head, Stack<Integer> stack) {
		
		boolean isLinkedListPalindrome=false;
		
		LinkedListNode tempNode=head;
		while(tempNode!=null)
		{
			stack.push(tempNode.getData());
			tempNode=tempNode.next;
		}
		
		while(head!=null)
		{
			int popedElement=stack.pop();
			if(head.getData()==popedElement) 
			{
				isLinkedListPalindrome=true;
			}	
			else 		
			{
				isLinkedListPalindrome=false;
				break;
			}
			head=head.next;
		}
		
		return isLinkedListPalindrome;
	}
}
