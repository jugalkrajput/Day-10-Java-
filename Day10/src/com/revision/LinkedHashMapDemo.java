package com.revision;

import java.util.*;

public class LinkedHashMapDemo {
	
	public static void main(String[] args) {
			
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(103, "Amit");
		map.put(101, "Rahul");
		map.put(102, "Priya");
		System.out.println(map); 		
	}
}

