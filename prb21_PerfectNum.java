package com.prbSet1;

import java.util.*;

public class prb21_PerfectNum {
	public static int perfect(int num) {
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
		int num = sc.nextInt();
		int res = perfect(num);
		if (num == res)
			System.out.println(res + " is a perfect number.");
		else
			System.out.println(res + " is not a perfect number.");
		sc.close();

	}

}