package Lecture_21;

public class LinkedList {

	private class Node {
		int Data;
		Node Next_Address;

	}

	private Node head;
	private Node tail;
	private int size;

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	public int getFirst() throws Exception {

		if (size == 0) {
			throw new Exception("Linked List is Empty");

		}
		return head.Data;
	}

	public int getLast() throws Exception {

		if (size == 0) {
			throw new Exception("Linked List is Empty");

		}
		return tail.Data;
	}

	public int getAt(int idx) throws Exception {
		if (size == 0) {
			throw new Exception("Linked List is Empty");

		}
		if (idx < 0 || idx >= size) {
			throw new Exception("Invalid Index");
		}
		Node temp = head;

		for (int i = 1; i <= idx; i++) {
			temp = temp.Next_Address;

		}

		return temp.Data;
	}

	public void Display() {
		System.out.println("-----------------------");
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.Data + " ");
			temp = temp.Next_Address;

		}
		System.out.println(".");
		System.out.println("-----------------------");

	}

	public void AddLast(int item) {

		Node nn = new Node();
		nn.Data = item;

		if (size > 0)
			tail.Next_Address = nn;

		if (size() == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			tail = nn;
			size++;
		}

	}

	public void AddFirst(int item) {

		Node nn = new Node();
		nn.Data = item;

		if (size > 0)
			nn.Next_Address = head;

		if (size() == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			head = nn;
			size++;
		}

	}

	public Node getNodeAt(int idx) throws Exception {
		if (size == 0) {
			throw new Exception("Linked List is Empty");

		}
		if (idx < 0 || idx >= size) {
			throw new Exception("Invalid Index");
		}
		Node temp = head;

		for (int i = 1; i <= idx; i++) {
			temp = temp.Next_Address;

		}

		return temp;
	}

	public void Add_index(int idx, int item) throws Exception {

		if (idx < 0 || idx > size) {
			throw new Exception("Invalid Index");
		}
		if (size == 0) {
			AddFirst(item);
		} else if (size == idx) {
			AddLast(item);

		} else {

			Node nn = new Node();
			nn.Data = item;

			Node nm1 = getNodeAt(idx - 1);
			Node np1 = getNodeAt(idx);

			nm1.Next_Address = nn;
			nn.Next_Address = np1;

			size++;

		}

	}

	public int RemoveFirst() throws Exception {
		if (size == 0) {
			throw new Exception("Linked List is Empty");

		}

		int temp = head.Data;

		if (size == 1) {
			head = null;
			tail = null;
			size--;
		} else {
			head = head.Next_Address;
			size--;
		}

		return temp;

	}

	public int RemoveLast() throws Exception {
		if (size == 0) {
			throw new Exception("Linked List is Empty");

		}

		int temp = tail.Data;

		if (size == 1) {
			head = null;
			tail = null;
			size--;
		} else {
			Node sm2 = getNodeAt(size - 2);
			sm2.Next_Address = null;

			tail = sm2;
			size--;
		}

		return temp;
	}

	public int Remove_idx(int idx) throws Exception {
		if (size == 0) {
			throw new Exception("Linked List is Empty");

		}
		if (idx < 0 || idx >= size) {
			throw new Exception("Invalid Index");
		}

		if (idx == 0) {
			return RemoveFirst();
		} else if (idx == size - 1) {
			return RemoveLast();
		} else {

			Node nm1 = getNodeAt(idx - 1);
			Node n = getNodeAt(idx);
			Node np1 = getNodeAt(idx + 1);

			nm1.Next_Address = np1;
			size--;
			return n.Data;
		}

	}
}
