package com.prbSet1;
import java.util.Scanner;

public class prb16_NthFib {
	public static int fib(int n) {
		int sum = 0;
		int f1 = 0;
		int f2 = 1;
		for (int i = 0; i < n - 2; i++) {
			sum = f1 + f2;
			f1 = f2;
			f2 = sum;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value :");
		int n = sc.nextInt();
		int sum = fib(n);
		System.out.println(sum);
		sc.close();

	}

}
