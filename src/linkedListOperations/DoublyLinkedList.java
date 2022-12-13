package linkedListOperations;

public class DoublyLinkedList {
	public class Node {
		int data;
		Node next;
		Node previous;

		public Node(int data) {
			this.data = data;
		}
	}

	Node head = null;
	Node tail = null;

	public void addNode(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
			head.previous = null;
			tail.next = null;
			return;
		} else {
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
			tail.next = null;
		}
	}

	public void display() {
		if (head == null) {
			System.out.println("List is Empty");
			return;
		}
		System.out.println("Nodes of DoublyLinkedList");
		Node temp = tail;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.previous;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList dlist = new DoublyLinkedList();
		dlist.addNode(90);
		dlist.addNode(80);
		dlist.addNode(70);
		dlist.addNode(60);
		dlist.addNode(50);
		dlist.addNode(40);
		dlist.addNode(30);
		dlist.addNode(20);
		dlist.addNode(10);

		dlist.display();

	}

}
