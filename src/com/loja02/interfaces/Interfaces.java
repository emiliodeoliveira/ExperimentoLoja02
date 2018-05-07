package com.loja02.interfaces;

import java.util.Scanner;

public class Interfaces {
	public static String readString(String msg) {
		Scanner input = new Scanner(System.in);
		System.out.println(msg);
		return input.nextLine();
	}

}
