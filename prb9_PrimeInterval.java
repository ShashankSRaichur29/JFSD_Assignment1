package com.prbSet1;

public class prb9_PrimeInterval {

	public static void prNum(int a,int b) {
		int flag;
		for (int i = a; i <= b; i++) {
			if (i == 1 || i == 0)
				continue;
			flag = 1;

			for (int j = 2; j <= i/2; ++j) {
				if (i % j == 0) {
					flag = 0;
					break;
				}

			}
			if (flag == 1) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		prNum(10,100);
	}

}
