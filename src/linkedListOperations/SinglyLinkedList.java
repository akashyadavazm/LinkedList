package linkedListOperations;

public class SinglyLinkedList {
	public class Node {
		int data;
		Node next;

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
			return;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void display() {
		Node temp = head;
		if (head == null) {
			System.out.println("List is Empty");
		}
		while (temp != null) {
			System.out.print(temp.data + "-> ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		SinglyLinkedList slist = new SinglyLinkedList();
		slist.addNode(10);
		slist.addNode(20);
		slist.addNode(30);
		slist.addNode(40);
		slist.addNode(50);
		slist.addNode(60);
		slist.addNode(70);
		slist.addNode(80);
		slist.addNode(90);

		slist.display();

	}
}
