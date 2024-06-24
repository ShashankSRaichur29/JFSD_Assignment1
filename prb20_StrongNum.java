package com.prbSet1;

import java.util.Scanner;

public class prb20_StrongNum {
	public static int fact(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;

	}

	public static int strong(int num) {
		int res = 0;
		int sum = 0;
		while (num > 0) {
			res = num % 10;
			sum = sum + fact(res);
			num = num / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value ");
		int n = sc.nextInt();
		int sum = strong(n);
		if (n == sum)
			System.out.println(sum + " is a Strong number.");
		else
			System.out.println(sum + " is not a strong number.");
		sc.close();
	}

}