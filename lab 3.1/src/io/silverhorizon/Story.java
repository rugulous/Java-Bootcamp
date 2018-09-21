package io.silverhorizon;

import java.util.Scanner;
import java.util.Random;

public class Story {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the main character's name:");		
		String characterName = input.nextLine();
		
		System.out.println("Please enter the villain's name:");
		String villainName = input.nextLine();
		
		System.out.println("Please enter a location:");
		String location = input.nextLine();
		
		System.out.println("Please enter the main character's weapon:");
		String characterWeapon = input.nextLine();
		
		System.out.println("Please enter the villain's weapon:");
		String villainWeapon = input.nextLine();
		
		System.out.println("Please enter an insult:");
		String insult = input.nextLine();
				
		input.close();
		
		System.out.println(characterName + " finally completes their journey to " + location + ".");
		System.out.println("It has been a long and arduous journey, but it will be worth it. They are so close to acheiving their goal - to defeat the evil " + villainName + ".");
		System.out.println(characterName + " arrives to discover " + villainName + ", " + villainWeapon + " drawn.");
		System.out.println("\"I've been expecting you, " + characterName + "\", crows " + villainName + ".");
		System.out.println("\"Quit your mockery, you " + insult + "!\", retorts " + characterName + ", drawing their " + characterWeapon);
		System.out.println(characterName + " and " + villainName + " begin to battle it out, raging all through " + location + ".");
		
		Random rand = new Random();
		int outcome = rand.nextInt(2);
		
		if(outcome == 0) {
			System.out.println(characterName + " manages to strike a fatal blow, finally defeating " + villainName + " and ridding the world of evil!");
		} else {
			System.out.println(villainName + " strikes down " + characterName + " with ease. The last hope for the world is gone. Evil reigns supreme.");
		}
		
		System.out.println("The End.");
	}
	
}
