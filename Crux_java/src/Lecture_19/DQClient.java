package Lecture_19;

public class DQClient {
	
	public static void main(String[] args) throws Exception  {
		
		Queue q= new DynamicQueue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		q.display();
		q.enqueue(60);
		q.display();
		
	}

}
