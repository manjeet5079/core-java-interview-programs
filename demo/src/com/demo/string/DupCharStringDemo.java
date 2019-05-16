package com.demo.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DupCharStringDemo {
	
	public void countDuplicateChars(String str){
		
		Map<Character, Integer> map= new HashMap<Character, Integer>();
		char[] charArray = str.toCharArray();
		
		for (char c : charArray) {
			if (map.containsKey(c)) {
				
				map.put(c, map.get(c)+1);
				
			}else {
				
				map.put(c, 1);
			}
		}
		
		Set<Character> keySet = map.keySet();
		
		for (Character character : keySet) {
			
			if (map.get(character)>1) {
				
			
			System.out.println("Char :"+character+" :count :"+map.get(character));
		}}
		
	}
	
	
	public static void main(String[] args) {
		
		DupCharStringDemo demo=new DupCharStringDemo();
		demo.countDuplicateChars("manjeet Kumar");
		
	}

}
