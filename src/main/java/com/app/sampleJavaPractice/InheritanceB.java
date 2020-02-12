package com.app.sampleJavaPractice;

public class InheritanceB extends InheritanceA {
	public void m2() {
		System.out.println("PRINT THE INGERITANCE B");
	}

	public static void main(String[] args) {
		InheritanceB b = new InheritanceB();
		b.m1();
		b.m2();

	}

}
