package Lecture_19;

import Lecture_18.Stack;

public class DymanicStack extends Stack {

	@Override
	public void push(int item) throws Exception {

		if (isFull()) {

			// Creating the double size array
			int[] na = new int[data.length * 2];

			// Coping the element
			for (int i = 0; i < data.length; i++) {
				na[i] = data[i];
			}
			// Reference Change
			data = na;
		}
		super.push(item);
	}

}
