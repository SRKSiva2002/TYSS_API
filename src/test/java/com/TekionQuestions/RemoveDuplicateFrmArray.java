package com.TekionQuestions;

import java.util.LinkedHashSet;

// Remove duplicate from array{20,10,30,50,10,20,40}

public class RemoveDuplicateFrmArray {

	public static void main(String[] args) {

		int[] a = { 20, 10, 30, 50, 10, 20, 40 };
		LinkedHashSet<Integer> l = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			l.add(a[i]);
		}
		for (Integer i : l) {
			System.out.print(i+" ");
		}
	}

		
}
