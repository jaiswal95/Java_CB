package Lecture_19;

import Lecture_18.Stack;

public class DSclient {
	
	public static void main(String[] args) throws Exception {
		
		Stack s=new DymanicStack();
		
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		s.display();
		
	}

}
