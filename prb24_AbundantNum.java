package com.prbSet1;

import java.util.Scanner;

public class prb24_AbundantNum {
	public static int sum(int num) {
		int res = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0)
				res += i;
			else
				continue;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value ");
		int n = sc.nextInt();
		int res = sum(n);
		if (res > n)
			System.out.println(n + " Abundant number.");
		else
			System.out.println(n + " not a Abundant number.");
		sc.close();

	}

}