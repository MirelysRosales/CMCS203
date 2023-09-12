/*
 * Class: CMSC203 
 * Instructor:Khandan Monshi
 * Description: Create an ESP Game in java
 * Due: MM/DD/YYYY
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Mirelys Rosales
 */

import java.util.*;

public class ESPGame 
{
	public static void main(String[] args)
	{
		String name, myDesc, dueDate, guess;
		final String RED = "Red", GREEN = "Green", BLUE = "Blue", ORANGE = "Orange", YELLOW = "Yellow";
		int rounds = 10, correct = 0;
		
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter your name:");
		name = userInput.nextLine();
		
		System.out.println("\nDescribe yourself: ");
		myDesc = userInput.nextLine();
		
		System.out.println("\nDue Date:");
		dueDate = userInput.nextLine();
		
		System.out.println("\nCMSC203 Assignment1: Test your ESP skills!");
		

		for (int roundNumber = 1; roundNumber <= rounds; roundNumber++) 
		{	System.out.println("Round " + roundNumber);
			
			String color = "";
			int n;
			Random rand = new Random();
			n = rand.nextInt(5);
			switch(n) 
			{
				case 0: color = RED; break;
				case 1: color = GREEN; break;
				case 2: color = BLUE; break;
				case 3: color = ORANGE; break;
				case 4: color = YELLOW; break;
			}
		

			System.out.println("I am thinking of a color.\n" +
						   			"Is it Red, Green, Blue, Orange, or Yellow?\n" +
									"Enter your guess: ");
			guess = userInput.nextLine();
			if (guess.equalsIgnoreCase(RED) || guess.equalsIgnoreCase(BLUE) || guess.equalsIgnoreCase(YELLOW) || guess.equalsIgnoreCase(ORANGE) || guess.equalsIgnoreCase(GREEN))
			{
				
			}	else 
				{
					System.out.println("You entered incorrect color. Is it Red, Green, Blue, Orange, or Yellow?");
					guess = userInput.nextLine();
				}
			if (guess == color) 
			{
				correct++;
				System.out.println("You guessed " + correct + " out of " + rounds + " colors correctly.");
			}
			System.out.println("I was thinking of " + color);

		}
		
		
		System.out.println("Game Over.");
		System.out.println("You guessed " + correct + " out of " + rounds + " colors correctly.");
		System.out.println("Username: " + name);
		System.out.println("User Description: " + myDesc);
		System.out.println("Due Date: " + dueDate);
	}
}
