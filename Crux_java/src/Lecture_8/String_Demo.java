package Lecture_8;

public class String_Demo {

	public static void main(String[] args) {

		String str = "hello";

		// length
		System.out.println(str.length());

		// charAt : 0 -> length-1
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(str.length() - 1));

		// substring : 0 -> length
		System.out.println(str.substring(1, 4)); // ell
		System.out.println(str.substring(1, 5)); // ello
		// System.out.println(str.substring(3,1)) ; // error
		System.out.println(str.substring(1)); // ello
		System.out.println(str.substring(2)); // llo
		System.out.println(str.substring(2, 2)); // blank : length : 0

		// Part-4 : Concatenate Two Strings
		String s1 = "hi";
		String s2 = "bye";
		String s3 = s1 + s2;
		System.out.println(s1 + ", " + s2 + ", " + s3);
		String s4 = s1.concat(s2);
		System.out.println(s1 + ", " + s2 + ", " + s4);

		// Part-5 : IndexOf
		System.out.println(str.indexOf('e'));
		System.out.println(str.indexOf("eL"));

		// Part-6 : StartsWith
		System.out.println(str.startsWith("He"));
		System.out.println(str.startsWith("he"));

		// Part-7 : Equals and ==
		s1 = "Hello";
		s2 = s1;
		s3 = "Hello";
		s4 = new String("Hello");

		System.out.println((s1 == s2) + ", " + s1.equals(s2));
		System.out.println((s1 == s3) + ", " + s1.equals(s3));
		System.out.println((s1 == s4) + ", " + s1.equals(s4));

		str = str.replace('l', 'w');
		System.out.println(str);
		
		long start = System.currentTimeMillis() ;		
		appendString();		
		long end = System.currentTimeMillis() ;
		
		System.out.println(end-start);

	}

	public static void appendString() {

		int n = 100000 ;
		String str = "";

		for (int i = 1; i <= n; i++) {
			str += i ;
 		}

	}
}


