package com.app.sampleJavaPractice;

public class MethodOverlaodinS {

	
	public void m1(int a , int b) {
		System.out.println("TEST THE Sample1 "+ a );
		System.out.println("TEST THE Sample2 "+ b );
	}
	

	public void m1(int a , int b,int c) {
		System.out.println("TEST THE Sample1 " +a );
		System.out.println("TEST THE Sample2 "+ b );
		System.out.println("TEST THE Sample3 "+ c );
	}
	public static void main(String[] args) {
	
		new MethodOverlaodinS().m1(11, 220);
		
		new MethodOverlaodinS().m1(11, 220,228);

	}

}
