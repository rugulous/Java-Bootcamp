import java.util.Scanner;

public class GuessAge {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your age");
		int age = input.nextInt();
		int guessedYear = 2018 - age;
		
		System.out.println("Were you born in " + guessedYear + "? [Y / N]");
		char correct = input.next().toLowerCase().charAt(0);
		
		if(correct == 'n') {
			System.out.println("Oops! Must be " + (guessedYear - 1) + " then!");
		} else {
			System.out.println("Nailed it");
		}
	}
	
}
