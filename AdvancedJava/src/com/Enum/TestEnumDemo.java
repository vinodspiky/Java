package com.Enum;

import com.Enum.EnumDemo.Season;

public class TestEnumDemo {

	public static void main(String[] args) {
		// Initializing current Season
		Season currentSeason = Season.SPRING;

		// Return Enum from String..using ValueOf
		// Converting String into Enum
		// Enum newSeason=Enum.valueOf(Season.class, "SPRING");
		Season newSeason = Enum.valueOf(Season.class, "SPRING");
		System.out.println(newSeason);
		if (newSeason instanceof Season) {
			System.out.println("true");
		}

		// When declared inside a class, enums are always
		// static by default and can be accessed as
		// OutClassRef.EnumType.EnumVar
		System.out.println(EnumDemo.Season.FALL);

		// Iterating over Enum using Values
		for (Season ss : Season.values()) {
			System.out.println(ss);

		}

	}

}
