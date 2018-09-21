package io.silverhorizon;

import java.util.Scanner;

public class TimesTableUserInput {
	public static void main(String[] args) {
		
		System.out.println("Please enter a number:");
		
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();
		
		for(int i = 0; i < 13; i++) {
			String output = "";
			
			output += i;
			
			if(i < 10) {
				output += " ";
			}
			
			System.out.println(output + " x " + number + " = " + i * number);
		}
	}
}
