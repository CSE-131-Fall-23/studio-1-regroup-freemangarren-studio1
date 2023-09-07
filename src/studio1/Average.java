package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("The first of the two integers to be averaged?");
	int x = in.nextInt();
	System.out.println("The second of the two integers to be averaged?");
	int y = in.nextInt();
	double average = (x + y)/2.0;
	System.out.println("Average of " + x + " and " + y + " is " + average);
	

	}

}
