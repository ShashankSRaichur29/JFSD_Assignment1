package com.prbSet1;
import java.util.*;

public class prb3_SumNnum {
	public static void SumofNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a N: ");
		int num = sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum=sum+i;
		}
		System.out.println("Sum of Numbers is :"+sum);
	}
	public static void main(String[] args) {
		SumofNum();
	}

}
