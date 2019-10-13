package Lecture_19;

public class Queue {

	protected int[] data;
	protected int Front;
	protected int Size;

	public Queue() {

		this.data = new int[5];
		this.Front = 0;
		this.Size = 0;
	}

	public Queue(int capacity) {

		this.data = new int[capacity];
		this.Front = 0;
		this.Size = 0;

	}

	public void enqueue(int item) throws Exception {
		if (isFull()) {
			throw new Exception("Queue is Full.");
		}

		int idx = (Front + Size) % data.length;
		data[idx] = item;
		Size++;
	}

	public int dequeue() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is Empty.");
		}
		int temp = data[Front];
		data[Front] = 0;
		Front = (Front + 1) % data.length;
		Size--;
		return temp;
	}

	public int getFront() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is Empty.");
		}

		int temp = data[Front];
		return temp;
	}

	public int size() {
		return Size;
	}

	public boolean isEmpty() {
		return Size == 0;
	}

	public boolean isFull() {
		return Size == data.length;
	}

	public void display() {
		System.out.println("------------------");
		for (int i = 0; i < Size; i++) {
			int idx = (i + Front) % data.length;
			System.out.print(data[idx] + " ");
		}
		System.out.println(".");
		System.out.println("------------------");
	}
}
