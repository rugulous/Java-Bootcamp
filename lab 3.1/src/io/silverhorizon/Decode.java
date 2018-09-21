package io.silverhorizon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Decode {

	public static void main(String[] args) {
		int[] code = {20,8,19,17,21,4,18,12,1,23,2,22,26,24,2,13,16,21,25,11,19,5,2,6,19,23,20,8,19,7,9,14,10,5,2,15};
		
		String answer = "t h e q u i c k b r o w n f o x j u m p e d o v e r t h e l a z y d o g ";
		
		Map<Integer, Character> guesses = new HashMap<Integer,Character>();
		guesses.put(19, 'e');
		guesses.put(2, 'o');
		guesses.put(1, 'b');
		guesses.put(25, 'm');
		guesses.put(15, 'g');
		
		boolean solved = false;
		
		Scanner input = new Scanner(System.in);
		
		while(!solved) {
			boolean allSwapped = true;
			String codeString = "";
			System.out.println("Here's the code, with your guesses substituted in:");
			for(int i = 0; i < code.length; i++) {
				if(guesses.containsKey(code[i])) {
					codeString += guesses.get(code[i]) + " ";
				} else {
					codeString += code[i] + " ";
					allSwapped = false;
				}
			}
			
			System.out.println(codeString);
			
			int option = -1;
			while(option == -1) {
			System.out.println("What would you like to do?");
			System.out.println("[1]: Submit a new guess");
			System.out.println("[2]: Change a guess");
			
			if(allSwapped) {
				System.out.println("[3]: Check answer");
			}
			
			option = input.nextInt();
			
			if(option < 1 || option > 3) {
				System.out.println("Please enter a valid option");
				option = -1;
			}
			
			}
			
			if(option == 1) {
				System.out.println("Which number do you wish to guess at?");
				int numToChange = input.nextInt();
				System.out.println("Which character do you wish to associate with " + numToChange + "?");
				char ch = input.next().charAt(0);
				guesses.put(numToChange, ch);
			} else if(option == 2) {
				System.out.println("Which number do you wish to change?");
				int numToChange = input.nextInt();
				System.out.println("Which character do you wish to associate with " + numToChange + "?");
				char ch = input.next().charAt(0);
				guesses.put(numToChange, ch);
			} else if(option == 3) {
				if(codeString == answer) {
					System.out.println("Yay! you solved it!");
					solved = true;
				} else {
					System.out.println("That's not quite right! Try again!");
				}
			}
		}
		
		input.close();
	}

}
