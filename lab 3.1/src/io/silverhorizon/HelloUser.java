package io.silverhorizon;

import java.util.Scanner;

public class HelloUser {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = input.nextLine();		
		input.close();
		
		System.out.println("Hello, " + name);
		System.out.println(name + ", it's great to meet you");
		System.out.println("Good day, " + name + ". How are you?");
		
	}
	
}
