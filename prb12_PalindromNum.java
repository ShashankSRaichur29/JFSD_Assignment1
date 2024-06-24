package com.prbSet1;

public class prb12_PalindromNum {
	public static void Palindrom(int original) {
		int reverseNum = 0;
		  int tempOriginal = original;

		  while (tempOriginal > 0) {

		    int lastDigit = tempOriginal % 10;
		    reverseNum = reverseNum * 10 + lastDigit;
		    tempOriginal = tempOriginal / 10;
		  }

		  if (original == reverseNum) {
		    System.out.println("Its a palindrom number");
		  } 
		  else {
			  System.out.println("Its not a palindrom number");
		  }
	}

	public static void main(String[] args) {
		Palindrom(15251);
	}

}
