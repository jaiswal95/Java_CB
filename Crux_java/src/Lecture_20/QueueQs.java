package Lecture_20;

import Lecture_19.DynamicQueue;
import Lecture_19.Queue;

public class QueueQs {

	public static void main(String[] args) throws Exception {

		Queue q = new DynamicQueue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);

		System.out.println("-----Display Reverse--------");
		q.display();
		DisplayReverse(q, 0);
		q.display();

		System.out.println("-----Actual Reverse--------");
		q.display();
		ActualReverse(q);
		q.display();

	}

	public static void DisplayReverse(Queue q, int count) throws Exception {

		if (q.size() == count) {
			return;
		}

		int temp = q.dequeue();
		q.enqueue(temp);
		DisplayReverse(q, count + 1);
		System.out.println(temp);

	}

	public static void ActualReverse(Queue q) throws Exception {
		if (q.isEmpty()) {
			return;
		}

		int temp = q.dequeue();
		ActualReverse(q);
		q.enqueue(temp);

	}

}
