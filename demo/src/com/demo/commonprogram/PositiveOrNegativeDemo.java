package com.demo.commonprogram;

import java.util.Scanner;

public class PositiveOrNegativeDemo {
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter your Number::");
		
		Scanner sc=new Scanner(System.in);
				int input = sc.nextInt();
		
		if(input>0){
			System.out.println(input+" :Number is Positive");
		}else{
			System.out.println(input+" :Number is Negative");
		}
		
		
	}

}
