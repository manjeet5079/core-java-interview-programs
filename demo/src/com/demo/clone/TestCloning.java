package com.demo.clone;

public class TestCloning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
        Address add = new Address(1, "Human Resource");
        CloneDemo original = new CloneDemo(1, "Admin", add);
        CloneDemo cloned = (CloneDemo) original.clone();
 
        //Let change the department name in cloned object and we will verify in original object
      
        cloned.getAddress().setName("mandal");
 
        System.out.println(original.getAddress().getName());
        System.out.println(cloned.getAddress().getName());
    }
}


