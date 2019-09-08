package Lecture_9;

public class StringBuilder_Demo {

	public static void main(String[] args) {

		// create
		String s = "hello";
		StringBuilder sb = new StringBuilder(s);

		// length
		System.out.println(sb.length());

		// charAt
		System.out.println(sb.charAt(2));

		// setCharAt
		sb.setCharAt(3, 'q');
		System.out.println(sb);

		// add
		sb.append("abc");
		System.out.println(sb);

		sb.insert(2, "def");
		System.out.println(sb);

		// delete
		sb.deleteCharAt(2);
		System.out.println(sb);

		// stringbuilder -> string
		String str = sb.toString();

	  }
 }
