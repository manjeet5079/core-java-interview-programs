package com.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("manjeet");
		list.add("vijay");
		list.add("patil");
		list.add("kumar");
		System.out.println("list:" + list);

		Collections.sort(list);
		System.out.println("list2:" + list);
		Collections.max(list);
		System.out.println("list3:" + list);
		Collections.min(list);
		System.out.println("list4:" + list);
		Collections.addAll(list, "sanjeet","ranjeet");
		System.out.println("list5:" + list);
		
	}

}
