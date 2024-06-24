package com.prbSet1;

public class prb7_LeapYear {
	static int year = 2024;

   
    public static boolean isLeapYear(int year) {
        boolean divisibleBy4 = (year % 4 == 0);
        boolean divisibleBy100 = (year % 100 == 0);
        boolean divisibleBy400 = (year % 400 == 0);

        if (divisibleBy4) {
            if (divisibleBy100) {
                if (divisibleBy400) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }


	public static void main(String[] args) {
		 if (isLeapYear(year)) {
		        System.out.println(year + " is a leap year.");
		    } else {
		        System.out.println(year + " is not a leap year.");
		    }
	}

}
