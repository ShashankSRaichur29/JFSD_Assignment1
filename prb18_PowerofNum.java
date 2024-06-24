package com.prbSet1;

import java.util.Scanner;

public class prb18_PowerofNum {
	public static int power(int a, int count) {
		int pow = 1;
		for (int i = 1; i <= count; i++) {
			pow *= a;
		}
		return pow;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base value : ");
		int base = sc.nextInt();
		System.out.println("Enter the exponent value : ");
		int exponent = sc.nextInt();
		System.out.println(power(base, exponent));
		sc.close();
	}
}