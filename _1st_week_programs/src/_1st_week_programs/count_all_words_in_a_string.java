package _1st_week_programs;

import java.util.Scanner;

public class count_all_words_in_a_string {
	public static void count_words() {
		String string;
		int count;
		Scanner str=new Scanner (System.in);
		System.out.print("Enter the string: ");
		string=str.nextLine();
		String[] words = string.split(" ");
	    count=words.length;
	    System.out.println("Count of string: "+count);
	}
	public static void main (String args []) {
		count_words();
	}

}
