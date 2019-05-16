package com.demo.commonprogram;

import java.util.Scanner;

public class EvenOdd {

	private static Scanner sc;

	public static void main(String[] args) {
		
		System.out.println("Enter your number :");
		sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if(input%2==0){
			System.out.println("No is even.");
		}else{
			System.out.println("No is odd.");
		}
	}
}
