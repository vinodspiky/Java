package com.hackerRank;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String time = in.next();
		String[] component = time.split(":");
		if (component[0].equals("12") && component[1].equals("00") && component[2].equals("00AM")) {
			component[2] = component[2].replace("A", "");
			component[2] = component[2].replace("M", "");
			component[0] = "00";
			component[1] = "00";
			component[2] = "00";

		} else if (component[0].equals("12") && component[1].equals("00") && component[2].equals("00PM")) {
			component[2] = component[2].replace("P", "");
			component[2] = component[2].replace("M", "");
		}

		else {
			int hrs = Integer.parseInt(component[0]) + 12;
			component[0] = "" + hrs;
			component[2] = component[2].replace("P", "");
			component[2] = component[2].replace("A", "");
			component[2] = component[2].replace("M", "");
		}

		System.out.println(component[0] + ":" + component[1] + ":" + component[2]);
	}

}
