import java.util.Scanner;


public class BMICalculator {
	public BMICalculator(){
		Scanner keyboard = new Scanner(System.in);
		
		double height;
		double weight;
		
		System.out.print("What is your height in meters? ");
		height = keyboard.nextDouble();
		System.out.print("How much do you weigh in kg? ");
		weight = keyboard.nextDouble();
		
		double BMI = weight / (height * height);
		System.out.println("\nYour height in meters: "+ height);
		System.out.println("Your weight in meters: "+ weight);
		System.out.println("Your BMI is: " + BMI);
		keyboard.close();
	}
}
