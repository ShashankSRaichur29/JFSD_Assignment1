package com.prbSet1;

import java.util.Scanner;

public class prb23_HarshadNum {
	public static int harshad(int num) {
		int sum = 0, a = 0;
		while (num > 0) {
			a = num % 10;
			sum += a;
			num = num / 10;

		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int n = sc.nextInt();
		int sum = harshad(n);
		if (n % sum == 0)
			System.out.println(n + " is a harshad number");
		else
			System.out.println(n + " is not a harshad number");
		sc.close();

	}

}