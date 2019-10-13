package Lecture_19;

public class DynamicQueue extends Queue {

	@Override
	public void enqueue(int item) throws Exception {
		if (isFull()) {
			// Creating a new double size Array
			int[] na = new int[data.length * 2];

			// Coping the element
			for (int i = 0; i < Size; i++) {
				int idx = (i + Front) % data.length;
				na[i] = data[idx];
			}
			// Refrence Change
			data = na;
			Front = 0;
		}
		super.enqueue(item);
	}

}
