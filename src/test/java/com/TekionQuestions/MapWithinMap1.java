package com.TekionQuestions;

import java.util.HashMap;
import java.util.Set;

public class MapWithinMap1 {

	public static void main(String[] args) {
		
		HashMap<String, HashMap<String, Integer>> h = new HashMap<String, HashMap<String,Integer>>();
		
		HashMap<String, Integer> i = new HashMap<String, Integer>();
		
		i.put("One", 1);
		i.put("Two", 2);
		i.put("Three", 3);
		
		h.put("1", i);
		
		Set<String> l = h.get("1").keySet();
		for (String s : l) {
			System.out.println(s);
		}
	}
}
