package com.revision;

import java.util.*;

public class HashMapDemo {
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(101, "Rahul");
		map.put(102, "Priya");
		map.put(103, "Amit");
		map.put(104, "Rahul Kumar");
		
		System.out.println(map);
		
		System.out.println(map.get(102));
		
		System.out.println(map.get(105));
		
		for (Integer key : map.keySet()) {
			System.out.println("key: " + key + ", Value: " + map.get(key));
		}
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}
}
