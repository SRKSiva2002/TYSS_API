package com.TekionQuestions;

public class PrintOnlyChara {

	public static void main(String[] args) {
		String s="Tekon123";
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z') {
				System.out.print(s.charAt(i));
			}
		}
	}
}
