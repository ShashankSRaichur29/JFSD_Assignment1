package com.prbSet1;
import java.util.Scanner;

public class prb17_Factorial {
	public static int fact(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		System.out.println("The factorial of number " + num + " is " + fact(num));
		sc.close();
	}

}