package _1st_week_programs;

import java.util.Scanner;

public class sum_of_the_digits_in_an_integer {
	public static void sumdigits() {
		Scanner num=new Scanner (System.in);
		System.out.print("Enter the number: ");
		int number=num.nextInt();
		num.close();
		int sum=0,digits,temp;
		temp=number;
		while(number>0) {
			digits=number%10;
			sum+=digits;
			number/=10;
		}
		System.out.println("Sum of digits in "+temp+" is: "+sum);
	}
	public static void main(String args[]) {
		sumdigits();
	}

}
