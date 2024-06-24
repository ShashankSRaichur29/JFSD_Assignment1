package com.prbSet1;
import java.util.*;

public class prb6_GreatestofThree {
	public static void GreatestofThree(int a,int b,int c) {
		if(a>b && a>c) {
			System.out.println(a+" is Greatest of all");
		}else if(b>c && b>a) {
			System.out.println(b+" is Greatest of all");
		}
		else {
			System.out.println(c+" is Greatest of all");
		}
	}
	public static void main(String[] args) {
		GreatestofThree(3, 5, 10);

	}

}
