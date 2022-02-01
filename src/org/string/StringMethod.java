package org.string;

public class StringMethod {
	public static void main(String[] args) {
		String s = "Kumaran DUrai ";
		
		boolean startswith = s.startsWith("K");
		System.out.println(startswith);
		
		boolean endsWith = s.endsWith(" ");
		System.out.println(endsWith);
		
		String trim = s.trim();
		System.out.println(trim);
		
		String s1 = "kumaran durai";
		
		boolean equals = s.equals(s1);
		System.out.println(equals);
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
		System.out.println(equalsIgnoreCase);
		
		boolean contains = s.contains("U");
		System.out.println(contains);
		
		int compareToIgnoreCase = s1.compareToIgnoreCase(s);
		System.out.println(compareToIgnoreCase);
		
		String replace = s.replace("U", "u");
		System.out.println(replace);
		
		String substring = s.substring(2, 10);
		System.out.println(substring);
	}

}
