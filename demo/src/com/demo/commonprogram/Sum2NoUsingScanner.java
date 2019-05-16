package com.demo.commonprogram;

import java.util.Scanner;

public class Sum2NoUsingScanner {

	public static void main(String[] args) {

		System.out.println("enter your first no:");

		Scanner sc = new Scanner(System.in);
		int sum1 = sc.nextInt();

		System.out.println("enter your second no:");
		Scanner sc1 = new Scanner(System.in);
		int sum2 = sc1.nextInt();

		int sum3 = sum1 + sum2;

		System.out.println("sum: " + sum3);
}
}