package DataStructure;

import java.util.Scanner;

class Node {

	int data;
	Node next;

}

public class LinkedList {

	static Node head;

	public void insert(int data) {
		Node node = new Node(); // Node Object
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node n = head; // Node type reference pointing to the first node

			while (n.next != null) {
				n = n.next; // Reaching to the last node from head
			}
			n.next = node; // In last Node, replacing null will new node's refrence
		}
	}

	public void insertBegining(int data) {
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;

	}

	public void insertAt(int data, int index) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		Node n = head;
		for (int i = 1; i < index - 1; i++) {
			n = n.next;
		}
		Node temp = n.next;
		n.next = node;
		node.next = temp;
	}

	public void nodeReverse() {

		Node prev = null;
		Node curr = head;
		Node next = null;

		while (curr != null) {

			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
	
	public void deleteEnd() {
		Node n = head;
		while (n.next.next != null) {
			n = n.next;
		}
		System.out.println(n.next.data+" Deleted");
		n.next = null;
		
	}
	
	public void deleteBegining() {
		Node n = head.next;
		System.out.println(head.data+" Deleted");
		head.next = null;
		head = n;		
		
	}
	
	public void show() {
		Node n = head; // Node type reference pointing to the first node

		while (n.next != null) {
			System.out.print(n.data +"-->");
			n = n.next;
		}
		System.out.print(n.data); // Printing Last Node which contains Null
		System.out.println();

	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		LinkedList list = new LinkedList();

		System.out.println("Option 1 : InsertEnd\t\tOption 2 : InsertBegining");
		System.out.println("Option 3 : InsertAtIndex\tOption 4 : DeleteEnd");
		System.out.println("Option 5 : DeleteBegining\tOption 6 : ReverseList");
		System.out.println("Option 7 : SHOW\t\t\tOption 8 : EXIT");
		
		while (true) {
			int data,i;
			int a = sc.nextInt();
			switch (a) {

			case 1:
				System.out.print("Enter Data : ");
				data = sc.nextInt();
				list.insert(data);
				System.out.println(data+" Inserted at the End");
				System.out.print("Press Option : ");
				break;

			case 2:
				System.out.print("Enter Data : ");
				data = sc.nextInt();
				list.insertBegining(data);
				System.out.println(data+" Inserted at the Begining");
				System.out.print("Press Option : ");
				break;

			case 3:
				System.out.print("Enter Data : ");
				data = sc.nextInt();
				System.out.println("Enter Index to Insert");
				i = sc.nextInt();
				list.insertAt(data, i);
				System.out.println(data+" Inserted at the Index "+i);
				System.out.print("Press Option : ");
				break;

			case 4:
				list.deleteEnd();
				System.out.print("Press Option : ");
				break;
				
			case 5:
				list.deleteBegining();
				System.out.print("Press Option : ");
				break;
				
				
			case 6:
				System.out.print("Reversing The List : ");
				list.nodeReverse();
				list.show();
				System.out.print("Press Option : ");
				break;
			

			case 7:
				System.out.print("Showing The List : ");
				list.show();
				System.out.print("Press Option : ");
				break;
				
			case 8:
				System.out.println("Terminating...\nTerminated");
				System.exit(0);
				break;
			}

		}
	}
}
