package com.TekionQuestions;

public class PrintSubstringsWhichArePalindrome {

	public static void main(String[] args) {
		String s ="abcbabadab";
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j <= s.length(); j++) {
				String sub=s.substring(i, j);
				int m =0;
				int n=sub.length()-1;
				boolean p = true;
				while (m<n) {
					if (sub.charAt(m)!=sub.charAt(n)) {
						p=false;
						break;
					}
					m++;
					n--;
				}
				if (p) {
					System.out.println(sub);
				}
			}
		}
	}
}
