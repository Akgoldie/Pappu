package _1st_week_programs;

import java.util.Scanner;

public class greater_among_three_numbers {
	public static void greater() {
		Scanner num=new Scanner (System.in);
		System.out.print("Enter the first number: ");
		int num1=num.nextInt();
		System.out.print("Enter the second number: ");
		int num2=num.nextInt();
		System.out.print("Enter the third number: ");
		int num3=num.nextInt();
		num.close();
		
		if(num1>=num2 && num1>=num3) {
			System.out.println(num1+" is largest number");
		}else if(num2>=num1 && num2>=num3) {
			System.out.println(num2+" is largest number");
		}else {
			System.out.println(num3+" is largest number");
		}
	}
	public static void main (String args[]) {
		greater();
	}

}
