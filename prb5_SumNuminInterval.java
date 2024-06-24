package com.prbSet1;


public class prb5_SumNuminInterval {
	public static void SumOfInterval(int a,int b) {
		int sum=0;
		for(int i=a;i<=b;i++) {
			sum=sum+i;
		}
		System.out.println("Sum of the interval "+sum);
	}
	public static void main(String[] args) {
		SumOfInterval(1, 5);
	}

}
