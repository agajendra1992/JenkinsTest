package com.app.sampleJavaPractice;

public class ReversString {

	public static void main(String[] args) {

		String s = "ADD THE SOAP UI IN TESTING";
		
		
		char ch [] = s.toCharArray();
		
		for (int i = ch.length-1;i>=0; i--) {
			System.out.print(ch[i]);
		}

	}

}
