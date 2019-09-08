package Lecture_9;

public class FormBiggest_number {
	
	public static void main(String[] args) {
		
		int[] arr = {8,899,857,86,897,889};
		Sorting(arr);
		for (int val : arr) {
			System.out.print(val);
		}
		
	}
	
	public static void Sorting(int[]arr) {
		for (int count = 0; count <= arr.length - 2; count++) {

			for (int j = 0; j <= arr.length - count - 2; j++) {

				if (compare(arr[j] , arr[j + 1])) {

					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	
	public static boolean compare(int n1,int n2) {
		
		String n1n2s = n1+""+n2;
		String n2n1s = n2+""+n1;
		
		int res = n1n2s.compareTo(n2n1s);
				
			if(res>0) {
				// Don't Swap
				return false;
			}else {
				//Swap
				return true;
			}
	  }
}
