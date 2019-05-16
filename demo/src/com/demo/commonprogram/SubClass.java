package com.demo.commonprogram;

class SuperClass {
	/*SuperClass(int x) {
		System.out.println("Super");
	}*/
	
	int SuperClass(int x) {
		System.out.println("Super");
		return x;
	}
}

public class SubClass extends SuperClass {
	SubClass() {
		super.SuperClass(10);
		System.out.println("Sub 2");
	}
	
	public static void main(String[] args) {
		SubClass sb=new  SubClass();
	}
}