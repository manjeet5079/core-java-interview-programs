package com.demo.string;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		StringBuilder s1 = new StringBuilder("Java");
		String s2 = "Love";
		s1.append(s2);
		System.out.println("s1:"+s1);
		String substring = s1.substring(2,4);
		System.out.println("s1 substring :"+substring);
		int foundAt = s1.indexOf(s2);
		System.out.println(foundAt);
	}
}
