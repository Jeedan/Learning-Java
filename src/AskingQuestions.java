import java.util.Scanner;


public class AskingQuestions {
	
	public AskingQuestions(){
		// doing everything in the constructor instead of creating methods
		Scanner keyboard = new Scanner(System.in);
		
		int age;
		String height;
		double weight;
		
		System.out.print("How old are you? ");
		age = keyboard.nextInt();
		
		System.out.print("How tall are you? ");
		height = keyboard.next();
		
		System.out.print("How much do you weight? ");
		weight = keyboard.nextDouble();
		
		System.out.print("So you're " + age + " and you're " + height + "cm tall " + "and you weight " + weight +"kg? ");
		
		keyboard.close();
	}
}
