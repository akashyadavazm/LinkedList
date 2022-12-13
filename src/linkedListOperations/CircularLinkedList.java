package linkedListOperations;

public class CircularLinkedList {
	public class Node {
		int data;
		Node next;

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
			return;
		} else {
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
	}

	public void display() {
		Node current = head;
		if (head == null) {
			System.out.println("List is Empty");
		} else {
			System.out.println("Nodes of the CircularLinkedList are : ");
			do {
				System.out.print(" " + current.data);
				current = current.next;
			} while (current != head);
			System.out.println();
		}

	}

	public static void main(String[] args) {
		CircularLinkedList clist = new CircularLinkedList();
		clist.addNode(10);
		clist.addNode(20);
		clist.addNode(30);
		clist.addNode(40);
		clist.addNode(50);
		clist.addNode(60);
		clist.addNode(70);
		clist.addNode(80);
		clist.addNode(90);

		clist.display();
	}
}
