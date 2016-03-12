package com.Doubt;

public class StaticOverB extends StaticOver {
	int a = 50;
	static int b = 100;

	public void showA() {
		System.out.println("B:SHowA");
		// System.out.println(super.a);//10
	}

	public static void showB() {
		System.out.println("B:SHowB Static");
	}
}
