package _1st_week_programs;

import java.util.Scanner;

public class average_of_three_numbers {
	public static void average() {
		Scanner num=new Scanner (System.in);
		System.out.print("Enter the first number: ");
		int num1=num.nextInt();
		System.out.print("Enter the second number: ");
		int num2=num.nextInt();
		System.out.print("Enter the third number: ");
		int num3=num.nextInt();
		num.close();
		
		double average = (num1+num2+num3)/3;
		System.out.println("Average of "+num1+","+num2+","+num3+" is: "+average);
	}
	public static void main (String args[]) {
		average();
	}

}
