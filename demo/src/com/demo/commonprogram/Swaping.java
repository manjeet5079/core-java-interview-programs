package com.demo.commonprogram;

import java.util.Scanner;

public class Swaping {
	public static Scanner sc;
	
	public static void main(String[] args) {
		
		sc=new Scanner(System.in);
		System.out.println("Enter your first number:");
		int x = sc.nextInt();
		System.out.println("Enter your second number:");
		int y = sc.nextInt();
		
		System.out.println("Initial value of x:"+x +" & y:"+y);
		x=x+y;
		y=x-y;
		x=x-y;
		
		
		System.out.println("Swapping value of x:"+x +" & y:"+y);

	}

}
