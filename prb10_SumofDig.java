package com.prbSet1;

import java.util.Scanner;

public class prb10_SumofDig {
	public static void Sumofdig() {
		int number, digit, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		number = sc.nextInt();
		while (number > 0) {
			digit = number % 10;
			sum = sum + digit;
			number = number / 10;
		}
		System.out.println("Sum of Digits: " + sum);
}

	public static void main(String[] args) {
		Sumofdig();
	}

}
