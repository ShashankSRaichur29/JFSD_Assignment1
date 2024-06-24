package com.prbSet1;

public class prb11_ReversingNum {
	public static void revNum(int num) {
		  if (num < 10) {
		         System.out.println(num);
		         return;
		  }
		    else {

		         System.out.print(num % 10);
		         revNum(num / 10);
		     }
		 }
	public static void main(String[] args) {
		int num=1231;
		System.out.println("Reversed number is: ");
		revNum(num);
	}

}
