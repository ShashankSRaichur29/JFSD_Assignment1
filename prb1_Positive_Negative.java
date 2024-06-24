package com.prbSet1;
import java.util.*;

public class prb1_Positive_Negative {
	public static void Positive_Negative() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		if(num>0) {
			System.out.println(num+" is Positive");
		}
		else {
			System.out.println(num+" is Negative");
		}
	}

	public static void main(String[] args) {
		Positive_Negative();
	}

}
