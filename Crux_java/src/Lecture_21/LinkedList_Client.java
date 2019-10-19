package Lecture_21;

public class LinkedList_Client {

	public static void main(String[] args) throws Exception {
		LinkedList list = new LinkedList();

		list.AddLast(10);
		list.AddLast(20);
		list.AddLast(30);
		list.AddLast(40);
		//list.Display();
		list.AddFirst(50);

		list.Display();
		list.Add_index(list.size(), 70);
//		list.Display();
//		
//		System.out.println(list.Remove_idx(2));
//		list.Display();
//		
//		System.out.println(list.RemoveFirst());
//		list.Display();
//		
//		System.out.println(list.RemoveLast());
		list.Display();

//		list.Reverse_Pointers_Recursively();
//		list.Display();
		
		
	}

}
