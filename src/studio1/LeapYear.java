package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Input a year: ");
		int year = in.nextInt();
	
		
		boolean leapYear = (year%4 == 0) && ((year%100 != 0) || (year%400 == 0)); 
		System.out.println(year + " is a leap year: " + leapYear);
		
		
	}

}





//1. int 
//2. boolean
//3. int 
//4. double 
//5. string
//6. string 
