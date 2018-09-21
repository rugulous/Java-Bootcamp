package io.silverhorizon;

public class TimesTable {
	public static void main(String[] args) {
		int number = 10;
		
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
