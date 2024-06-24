package com.prbSet1;

import java.util.Scanner;

public class prb2_Even_Odd {
	public static void EvnOdd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println(num+" is Even Number");
		}
		else {
			System.out.println(num+" is Odd Number");
		}
	}

	public static void main(String[] args) {
		
		EvnOdd();
	}

}
