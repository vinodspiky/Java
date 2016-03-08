package com.Enum;

public enum ConStructorInEnum {
	LAMBORGINI(900), TATA(2), AUDI(50), FIAT(15), HONDA(12);
	private int price;

	// Constructor
	ConStructorInEnum(int p) {
		price = p;
	}

	int getPrice() {
		return price;
	}
}
