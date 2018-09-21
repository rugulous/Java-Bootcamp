import java.util.Scanner;

public class GuessANumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean playing = true;
		
		while(playing) {
			int randomNumber = (int)(Math.random() * 10) + 1;
			System.out.println("I'm thinking of a number between 1 and 10, can you guess what it is?");
			int guess = input.nextInt();
			
			if(guess == randomNumber) {
				System.out.println("Yeah!! You got it!!");
			} else {
				System.out.println("Nope. I was thinking of " + randomNumber);
			}
			
			System.out.println("Play again? [Y / N]");
			
			if(input.next().toLowerCase().charAt(0) == 'n') {
				playing = false;
			}
		}
		
		System.out.println("Thanks for playing!");
	}
	
}
