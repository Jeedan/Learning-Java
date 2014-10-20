import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import javax.swing.*;

public class GoodFirstProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//PrintLetter pL = new PrintLetter();
	}
	
	@SuppressWarnings("unused")
	private static void FizzBuzz(){
		String fizz = "Fizz";
		String buzz = "Buzz";
		String fizBuz = fizz+buzz;
		
		for(int i = 1; i <= 100; i++){
			if((i % 3 == 0 ) && (i % 5 == 0))
				System.out.println(fizBuz);
			else if((i % 3 == 0 ) )
				System.out.println(fizz);
			else if((i % 5 == 0))
				System.out.println(buzz);
			else
				System.out.println(i);
		}
	}
	
	@SuppressWarnings("unused")
	private static void CollatzSequence(){
		Scanner keyboard = new Scanner(System.in);
		int n;
		
		System.out.println("Starting number: ");
		n = keyboard.nextInt();
		
		int xPos = 0;
		int steps = 0;
		int largestValue = 0;
		while(n > 1){
			if(n > largestValue)
				largestValue = n;
			if(n % 2 == 0) // even numbers
				n /= 2;
			else 
				n =(3*(n)) + 1;; // odd numbers

			System.out.print(n + "\t");	
			xPos += 1;
			steps += 1;
			if(xPos == 10){
				System.out.print("\n");
				xPos = 0;
			}
		}
	
		if(n == 1)
			System.out.print(1 + "\n\n");

		System.out.println("The largest value was " + largestValue + ".");
		System.out.println("Terminated after " + steps + " steps.");
		keyboard.close();
	}
	
	@SuppressWarnings("unused")
	private static void HiLoGuessNumber(){
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int randomNumber = 1 + r.nextInt(100);
		int tries = 0;

		System.out.println("Type 0 to exit the game.");
		System.out.println("I'm thinking of a number between 1-100. You have 7 tries.");
		System.out.print("First Guess: ");
		int guess = keyboard.nextInt();
		
		while(tries < 7 && guess != randomNumber && guess != 0){
			
			if(guess > randomNumber){
				System.out.println("Sorry, that is too high.");
			}
			else{
				System.out.println("Sorry, you are too low.");
			}
			tries++;
			System.out.print("Guess # " + tries + ":");
			guess = keyboard.nextInt();
		}
		
		if(guess == 0){
			System.out.println("You closed the App.");
		}
		else if(guess == randomNumber){
			System.out.println("You guessed it! What are the odds?!?.");
		}
		else if (guess != randomNumber && tries >= 7){
			System.out.println("Sorry, you didn't get it in 7 tries. You lose.");
		}
		
		keyboard.close();
	}
	
	@SuppressWarnings("unused")
	private static void AddWhileLooping(){
		Scanner keyboard = new Scanner(System.in);
		int total = 0;

		System.out.println("I will add up the numbers you give me.\n");
		System.out.print("Number: ");
		int input = keyboard.nextInt();
		
		while(input != 0){
			total += input;
			System.out.println("The total is " + total);
			System.out.print("Number: ");
			input = keyboard.nextInt();
		}
		
		if(input == 0){
			System.out.println("The total is " + total);
		}
		keyboard.close();
	}
	
	@SuppressWarnings("unused")
	private static void CountingInWhileLoop(){
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "Type in a message, and I'll display it five times." );
		System.out.print( "Message: " );
		String message = keyboard.nextLine();

		int n = 0;
		System.out.print( "How many times? " );
		int inputCount = keyboard.nextInt();
		while ( n < inputCount ){
			System.out.println( ((n+1) * 10) + ". " + message );
			n++;
		}
		keyboard.close();
	}
	
	@SuppressWarnings("unused")
	private static void TypingTextEffect() {
		Scanner keyboard = new Scanner(System.in);
		
		String greetings = "Hello traveller, my name is Professor Oak!\nThat's right the world renown Pokemon Professor!.";
		String scrollText = "";
		for(int i = 0; i < greetings.length(); i++){
			scrollText += greetings.substring(i, i+1);
			try {
			    //thread to sleep for the specified number of milliseconds
			    Thread.sleep(50);
			} catch ( java.lang.InterruptedException ie) {
			    System.out.println(ie);
			}
			System.out.print(scrollText.charAt(i));
		}
		keyboard.close();
	}
	
	@SuppressWarnings("unused")
	private static void SafeSquareRoot(){
		Scanner keyboard = new Scanner(System.in);
		int input = 0;
		double square = 0;
		
		System.out.print("SQUARE ROOT!\n");
		System.out.print("Enter a number: ");
		input = keyboard.nextInt();
		while(input < 0){
			System.out.println("You can't take the square root of a negative number, silly.");
			System.out.println("Try again: ");
			input = keyboard.nextInt();
		}
		
		if(input >= 0){
			square = Math.sqrt(input);
			System.out.println("The square root of "+ input + " is " + square + ".");
		}
		
		keyboard.close();
	}
	
	@SuppressWarnings("unused")
	private static void RandomNumbers(){
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int randomNUmber = 1 + r.nextInt(10);
		int input = 0;

		System.out.println("I'm thinking of a number from 1 to 10.\n");
		System.out.print("Your guess: ");
		input  = keyboard.nextInt();
		if(input == randomNUmber){
			System.out.println("Holy shit you got it! It really was "+ input);
		}
		else {
			System.out.println("Sorry, but I was really thinking of "+ randomNUmber);
		}
			
		keyboard.close();
	}

	@SuppressWarnings("unused")
	private static void RollADice(){
		Random r = new Random();
		int roll1 = 1 + r.nextInt(6);
		int roll2 = 1 + r.nextInt(6);
		int tries = 1;
		
		while(roll1 != roll2){
			
			System.out.println("HERE COME THE DICE!\n");
			System.out.println("Roll #1 " + roll1);
			System.out.println("Roll #2: "+ roll2);
			System.out.println("The total is " + (roll1+roll2));
			System.out.println("\nTry again!\n");
			
			try {
			    //thread to sleep for the specified number of milliseconds
			    Thread.sleep(600);
			} catch ( java.lang.InterruptedException ie) {
			    System.out.println(ie);
			}
			
			roll1 = 1 + r.nextInt(6);
			roll2 = 1 + r.nextInt(6);
			tries++;
		}
		
		if(roll1 == roll2){
			System.out.println("\nTHEY ARE THE SAAMME!\n");
			System.out.println("Roll #1 " + roll1);
			System.out.println("Roll #2: "+ roll2);
			System.out.println("The total is " + (roll1+roll2));
			System.out.println("It took " + (tries));
		}
	}
	
	@SuppressWarnings("unused")
	private static void RollADiceAgain(){
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int roll1 = 1 + r.nextInt(6);
		int roll2 = 1 + r.nextInt(6);
		int tries = 1;
		String input = "";
		
		System.out.println("HERE COME THE DICE!\n");
		
		do{
			System.out.println("Roll #1 " + roll1);
			System.out.println("Roll #2: "+ roll2);
			System.out.println("The total is " + (roll1+roll2));
			if(roll1 != roll2){
				System.out.print("\nTry again?  y / n ");
				input = keyboard.next();
				tries++;
				roll1 = 1 + r.nextInt(6);
				roll2 = 1 + r.nextInt(6);
			}
		}
		while(input.equals("y") && roll1 != roll2);
		
		if(input.equals("n")){
			System.out.println("OK Bye!");
		}
		
		if(roll1 == roll2){
			System.out.println("\nTHEY ARE THE SAAMME!\n");
			System.out.println("Roll #1 " + roll1);
			System.out.println("Roll #2: "+ roll2);
			System.out.println("The total is " + (roll1+roll2));
			System.out.println("It took " + (tries));
		}
		
		keyboard.close();
	}
	
	@SuppressWarnings("unused")
	private static void AlphabeticalOrder(){
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("What is your name? ");
		String input = keyboard.next();
		
		if (input.compareTo("Carswell") <= 0)
			System.out.println("you don't have to wait long");
		else if (input.compareTo("Jones") <= 0)
			System.out.println("that's not bad");
		else if (input.compareTo("Smith") <= 0)
			System.out.println("looks like a bit of a wait");
		else if (input.compareTo("Young") <= 0)
			System.out.println("it's gonna be a while");
		else if (input.compareTo("Young") > 0)
			System.out.println("not going anywhere for a while?");
		

		keyboard.close();
	}

	@SuppressWarnings("unused")
	private static void LearningCompareTo(){
		
		System.out.print("Comparing \"axe\" with \"dog\" produces ");
		int index = "axe".compareTo("dog");
		System.out.println(index);
		//System.out.print("Comparing \"applebee's\" with \"apple\" produces ");
		//System.out.println( "applebee's".compareTo("apple") );
		
		String str[] = {"zed","amazing","moist", "butter", "Chicken", "a","b", "c" };
		
		// less than is alphabetical, 0 is just printing it as it came in, greater than is alphabetically backwards
		for(int k = 0; k < str.length; k++){
			for(int nextSort = k + 1; nextSort < str.length; nextSort++){
				index = str[nextSort].compareTo(str[k]);
				if(index < 0){ 
					String s = str[k];	
					str[k] = str[nextSort];
					str[nextSort] = s;
					//System.out.println("Comparing "+ str[nextSort] +  " with "+str[k] );
				}
			}
			System.out.println(str[k]  + "\t\t" +  index);
		}
	}
	
	@SuppressWarnings("unused")
	private static void ShowJFrameWindow(){
		BoringWindow window = new BoringWindow();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

	@SuppressWarnings("unused")
	private static void UseSwingForInput(){
		String name = JOptionPane.showInputDialog("What is your name?");
		String input = JOptionPane.showInputDialog("How old are you?");
		int age = Integer.parseInt(input);
		
		System.out.println("Hello " + name + " ");
		System.out.println("Next year you'll be " + (age++));
		System.exit(0);
	}
}
