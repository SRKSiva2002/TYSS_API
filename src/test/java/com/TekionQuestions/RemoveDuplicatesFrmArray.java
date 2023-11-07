package com.TekionQuestions;

public class RemoveDuplicatesFrmArray {

	public static void main(String[] args) {
		int[] a = { 20, 10, 30, 50, 10, 20, 40 };
		boolean[] b = new boolean[a.length];
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			if (b[i] == false) {
				for (int j = i; j < a.length; j++) {
					if (a[i] == a[j]) {
						count++;
						b[j] = true;
					}
				}
			}
			if (count >= 1) {
				System.out.print(a[i] + " ");
			}
		}
	}
}
