import java.util.Scanner;

public class FruitMachine {

	public static void main(String[] args) {
		boolean playing = true;
		Scanner input = new Scanner(System.in);
		while(playing) {
			System.out.println("How much would you like to wager?");
			int wager = input.nextInt();
			
			int fruit1Int = (int)(Math.random() * 12) + 1;
			int fruit2Int = (int)(Math.random() * 12) + 1;
			int fruit3Int = (int)(Math.random() * 12) + 1;
			
			fruit fruitOne = resolveFruit(fruit1Int);
			fruit fruitTwo = resolveFruit(fruit2Int);
			fruit fruitThree = resolveFruit(fruit3Int);
			
			System.out.println("You span...");
			System.out.println(fruitOne);
			System.out.println(fruitTwo);
			System.out.println(fruitThree);
			
			if(fruitOne == fruitTwo &&  fruitTwo == fruitThree) {
				int winnings = wager;
				
				switch(fruitOne) {
				case APPLE:
					winnings *= 5;
					break;
				case ORANGE:
					winnings *= 20;
					break;
				case BANANA:
					winnings *= 40;
					break;
				case WATERMELON:
					winnings *= 100;
				}
				
				System.out.println("You won " + winnings + " from initial wager of " + wager);
			} else {
				System.out.println("You lost " + wager);
			}
			
			System.out.println("Spin again? [Y / N]");
			if(input.next().toLowerCase().charAt(0) == 'n') {
				playing = false;
			}
		}
		
		input.close();
		System.out.println("Thanks for playing!");
		
		input.close();
	}
	
	protected static fruit resolveFruit(int f) {
		if(f > 0 && f < 7) {
			return fruit.APPLE;
		} else if(f > 6 && f < 10) {
			return fruit.ORANGE;
		} else if(f > 9 && f < 12) {
			return fruit.BANANA;
		} else {
			return fruit.WATERMELON;
		}
	}
	
	public enum fruit{
		APPLE,
		ORANGE,
		BANANA,
		WATERMELON
	};
	
}
