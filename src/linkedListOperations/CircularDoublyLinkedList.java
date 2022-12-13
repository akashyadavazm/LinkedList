package linkedListOperations;

public class CircularDoublyLinkedList {

	public class Node {
		int data;
		Node next;
		Node previous;

		public Node(int data) {
			this.data = data;
		}

	}

	public Node head = null;
	public Node tail = null;

	public void addNode(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
			head.previous = tail;
			tail.next = head;
			return;
		} else {
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
			tail.next = head;
			head.previous = tail;

		}

	}

	public void display() {
		Node temp = head;
		if (head == null) {
			System.out.println("List is Empty");

		} else {
//			For Forward Direction
			System.out.println("Nodes of DoublyCircularLinkedList in forward direction are :");
			do {
				System.out.print(" " + temp.data);
				temp = temp.next;
			} while (temp != head);
			System.out.println();
//			For Reverse Direction
			Node last = tail;
			System.out.println("Nodes of DoublyCircularLinkedList in reverse direction are :");
			do {
				System.out.print(" " + last.data);
				last = last.previous;
			} while (temp.previous != last);
		}
	}

	public static void main(String[] args) {
		CircularDoublyLinkedList dclist = new CircularDoublyLinkedList();
		dclist.addNode(10);
		dclist.addNode(20);
		dclist.addNode(30);
		dclist.addNode(40);
		dclist.display();

	}
}
