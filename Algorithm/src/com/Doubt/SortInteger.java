package com.Doubt;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class SortInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(34);
		intList.add(1);
		intList.add(99);
		intList.add(6);
		intList.add(8);

		System.out.println(intList);
		Collections.sort(intList);
		System.out.println(intList);

	}

}
