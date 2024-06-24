package com.prbSet1;
import java.util.*;

public class prb4_GreaterOfTwo {
	public static void Greatest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number: ");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd Number: ");
		int num2=sc.nextInt();
		if(num1>num2) {
			System.out.println(num1+ " is Greater than "+num2 );
		}
		else {
			System.out.println(num2+" is Greater than "+num1);
		}
		}
	public static void main(String[] args) {
		Greatest();
	}

}
