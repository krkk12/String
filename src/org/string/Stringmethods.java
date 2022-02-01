package org.string;

public class Stringmethods {
	public static void main(String[] args) {

		String s = "selenium class";
		
		//LENGTH OF GIVEN STRING
		int a = s.length();
		System.out.println(a);
		
		//FINDING A CHARACTER IN A STRING 
		char b = s.charAt(6);
		System.out.println(b);
		
		//FINDING THE POSITION OF A CHARACTER IN THE STRING
		int c = s.indexOf('m');
		System.out.println(c);
		
		//FINDING THE POSITION OF  MULTIPLE OCCURENCE CHARACTER IN THE STRING
		int d = s.indexOf('e', 2);
		System.out.println(d);
		
		int e = s.indexOf('s', 2);
		System.out.println(e);
		
		//FINDING THE POSITION OF A CHARACTER FROM THE LAST IN THE STRING
		int f = s.lastIndexOf('s');
		System.out.println(f);
		
		//FINDING THE POSITION OF  MULTIPLE OCCURENCE CHARACTER FROM THE LAST IN THE STRING
		int f1 = s.lastIndexOf('s', 0);
		System.out.println(f1);
		//NEEDS TO BE SORTED OUT.ITS WRONG
		
		//CONVERTING THE STRING INTO UPPER AND LOWER CASES
		String m = s.toUpperCase();
		System.out.println(m);
		
		String m1 = s.toLowerCase();
		System.out.println(m1);
		
		
		
		
		
		
	}
}
