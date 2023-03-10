package _1st_week_programs;

import java.util.Scanner;

public class count_all_vowels_in_a_string {
	public static void count_vowels() {
		String string;
		char chars;
		int count=0,length;
		Scanner str=new Scanner (System.in);
		System.out.print("Enter the string: ");
		string=str.nextLine();
		str.close();
		length=string.length();
		for (int i=0; i<length; i++) {
			chars=string.charAt(i);
			if(chars=='a'|| chars=='A'|| chars=='e'|| chars=='E'|| chars=='i'|| chars=='I'|| chars=='o'|| chars=='O'|| chars=='u'|| chars=='U') {
				count+=1;
			}
		}System.out.println("Number of vowels in string: "+count);
	}
	public static void main(String args[]) {
		count_vowels();
	}
}
