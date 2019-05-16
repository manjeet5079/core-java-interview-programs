package com.demo.abstraction;




interface HashTaiil{
	int getTailLength();
}
  abstract class abstractDemo implements HashTaiil {

	public int getTailLength() {
		
		return 4;
	}
  }
	
public class MainDemo extends abstractDemo{
	
	public static void main(String[] args) {
		
		abstractDemo ad=new MainDemo();
		System.out.println(ad.getTailLength());
	}
	
	public int getTailLength(){
		
		return 2;
	}
}
