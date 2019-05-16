package com.demo.string;

public class StringDemo {
	
	
	public static void main(String[] args) {
		
		
		String s="Manjeet Kumar";
		
		System.out.println("lenght:"+s.length());
		System.out.println("index:"+s.indexOf("r"));
		
		String ss=new String();
		String concat = ss.concat("Manjeet Kumar");
		
		System.out.println(s==concat);
		System.out.println(s.equals(concat));
	}

}
