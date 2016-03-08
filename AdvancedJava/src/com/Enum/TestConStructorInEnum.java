package com.Enum;

public class TestConStructorInEnum {

	public static void main(String[] args) {
		System.out.println("All car prices:");
		for (ConStructorInEnum c : ConStructorInEnum.values())
			System.out.println(c + " costs " + c.getPrice() + " thousand dollars.");
	}

}
