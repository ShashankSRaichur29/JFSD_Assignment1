package com.prbSet1;
import java.util.*;

public class prb8_Prime {

	public static void prNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num ");
		int num=sc.nextInt();
		int flag;
		for (int i = 1; i <= num; i++) {
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
		prNum();
	}

}
