package com.Doubt;

public class StaticOverridingTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticOver staticObj = new StaticOverB();
		staticObj.showA();
		staticObj.showB();
		StaticOverB staticObjectB = new StaticOverB();
		// System.out.println(staticObjectB.a);//50

		System.out.println("Calling of subtype object");
		staticObjectB.showB();
		// This confirms that the static methods are always resolved
		// using their compile time type information only.

	}
}
