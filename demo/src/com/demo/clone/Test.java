package com.demo.clone;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address add=new Address(111, "manjeet");
		System.out.println("addd:"+add);
		CloneDemo cd=new CloneDemo(101, "Kumar", add);
		System.out.println("cd:"+cd);
		
		CloneDemo clone = (CloneDemo) cd.clone();
		System.out.println("clone:"+clone.getId());
		
		//Must be true and objects must have different memory addresses
        System.out.println(cd != clone);
        
        
      //As we are returning same class; so it should be true
        System.out.println(cd.getClass() == clone.getClass());
        
        
        //Default equals method checks for references so it should be false. If we want to make it true,
        //then we need to override equals method in Employee class.
        System.out.println(cd.equals(clone));
		
	}
}
