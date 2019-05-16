package com.demo.commonprogram;

public class DoubleNumber {

	public static void main(String[] args) {
		try {

			Double number = Double.valueOf(120D);
			System.out.println(number);

		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		

	}
}
