package demoProj;

class Node{
	int data;
	Node next;
	
}

public class LinkedListScratch {
	
	public static void display(Node head) {
		Node n= head;
		while(n!=null) {
			System.out.println("NOde Data"+ n.data);
			n=n.next;
		}
	}
	
	public static int addNode(Node head, int d) {
		Node n= head;
		while(n.next!=null) {
			
			n=n.next;
		}
		n.next= new Node();
		n.next.data= d;
		return d;
	}
	
	public static void main(String[] args  ) {
		Node head= new Node();
		head.data= 10;
		
		LinkedListScratch.addNode(head, 19);
		LinkedListScratch.addNode(head, 34);
		LinkedListScratch.addNode(head, 89);
		LinkedListScratch.addNode(head, 124);
		
		LinkedListScratch.display(head);
		
	}
}
