package Lecture_21;

public class LinkedList {

	private class Node {
		int Data;
		Node Next_Address;

	}

	private Node head;
	private Node tail;
	private int size;

	// O(1)
	public boolean isEmpty() {
		return size == 0;
	}

	// O(1)
	public int size() {
		return size;
	}

	// O(1)
	public int getFirst() throws Exception {

		if (size == 0) {
			throw new Exception("Linked List is Empty");

		}
		return head.Data;
	}

	// O(1)
	public int getLast() throws Exception {

		if (size == 0) {
			throw new Exception("Linked List is Empty");

		}
		return tail.Data;
	}

	// O(n)
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

	// O(n)
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

	// O(1)
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

	// O(1)
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

	// O(n)
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

	// O(n)
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

	// O(1)
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

	// O(n)
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

	// O(n)
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

	// RDI
	public void Reverse_Data_Iteratively() throws Exception {
		int First = 0;
		int End = this.size - 1;

		while (First < End) {
			Node Fn = getNodeAt(First);
			Node Ln = getNodeAt(End);

			int temp = Fn.Data;
			Fn.Data = Ln.Data;
			Ln.Data = temp;

			First++;
			End--;

		}

	}

	// RPI
	public void Reverse_Pointers_Iteratively() {

		Node Previous = null;
		Node Current = head;

		while (Current != null) {
			Node Ahead = Current.Next_Address;
			Current.Next_Address = Previous;
			Previous = Current;
			Current = Ahead;

		}
		Node temp = head;
		head = tail;
		tail = temp;

	}

	// RPR
	public void Reverse_Pointers_Recursively() {
		Reverse_Pointers_Recursively(null, head);
		Node temp = head;
		head = tail;
		tail = temp;

	}

	private void Reverse_Pointers_Recursively(Node Previous, Node Current) {
		if (Current == null) {
			return;
		}
		Reverse_Pointers_Recursively(Current, Current.Next_Address);
		Current.Next_Address = Previous;

	}

	// RDR by Return
	public void Reverse_Data_Recursively() {
		Reverse_Data_Recursively_ByReturn(head, head, 0);
	}

	private Node Reverse_Data_Recursively_ByReturn(Node left, Node right, int count) {

		if (right == null) {
			return left;
		}
		Node cl = Reverse_Data_Recursively_ByReturn(left, right.Next_Address, count + 1);
		if (count >= size / 2) {
			int temp = cl.Data;
			cl.Data = right.Data;
			right.Data = temp;

		}
		return cl.Next_Address;

	}

	// RDR By Heap
	private class HeapMover {
		Node left;

	}

	public void Reverse_Data_Recursively_Heap() {

		HeapMover mover = new HeapMover();
		mover.left = head;
		Reverse_Data_Recursively_Heap(mover, head, 0);

	}

	private void Reverse_Data_Recursively_Heap(HeapMover mover, Node right, int count) {

		if (right == null) {
			return;
		}
		Reverse_Data_Recursively_Heap(mover, right.Next_Address, count + 1);
		if (count >= size / 2) {
			int temp = mover.left.Data;
			mover.left.Data = right.Data;
			right.Data = temp;

		}
		mover.left = mover.left.Next_Address;

	}

	// Fold

	public void fold() {
		fold(head, head, 0);
	}

	private Node fold(Node left, Node right, int count) {

		if (right == null) {
			return left;
		}

		Node cl = fold(left, right.Next_Address, count + 1);
		if (count > size / 2) {
			Node Ahead = cl.Next_Address;
			cl.Next_Address = right;
			right.Next_Address = Ahead;
			return Ahead;
		}
		if (count == size / 2) {
			tail = right;
			tail.Next_Address = null;
		}
		return null;

	}

	// Mid
	public int mid() {
		Node slow = this.head;
		Node fast = this.head;

		while (fast != null && fast.Next_Address != null) {
			slow = slow.Next_Address;
			fast = fast.Next_Address.Next_Address;
		}
		return slow.Data;
	}

	// Kth from Last
	public int kthlast(int k) {

		Node front = this.head;
		Node back = this.head;
		for (int i = 1; i <= k; i++) {
			front = front.Next_Address;
		}
		while (front != null) {
			front = front.Next_Address;
			back = back.Next_Address;
		}
		return back.Data;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
