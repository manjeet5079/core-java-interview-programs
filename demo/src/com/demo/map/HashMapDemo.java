package com.demo.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	
	public static void main(String[] args) {
		
		
		HashMap<Integer, String> hashMap= new HashMap<>();
		
		hashMap.put(1, "White");
		hashMap.put(2, "Green");
		hashMap.put(3, "Yello");
		hashMap.put(4, "blue");
		hashMap.put(5, "black");
		
		System.out.println(hashMap);
		
		for(Map.Entry<Integer, String> entry: hashMap.entrySet()){
			
			System.out.println(entry.getKey() + "=>" + entry.getValue());
		}
	}
}
