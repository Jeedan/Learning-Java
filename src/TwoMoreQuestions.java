import java.util.Scanner;


public class TwoMoreQuestions {
	public TwoMoreQuestions(){
		Scanner keyboard = new Scanner(System.in);
		
		String inside = "inside";
		String outside = "outside";
		String both = "both";
		String alive = "yes";
		String notAlive = "no";
		
		String input;
		String input2;
	
		String q1 = "\nQuestion 1) Does it stay inside or outside or both?";
		String q2 = "Question 2) Is it a living thing?";

		System.out.println("TWO MORE QUESTIONS, BABY!");
		System.out.println("\nThink of something and I\'ll try to guess it!");
		
		System.out.println(q1);
		input = keyboard.next();
		System.out.println(q2);
		input2 = keyboard.next();
		
		if(input.equals(outside) && input2.equals(alive))
			System.out.println("\niz bison.");

		if(input.equals(outside) && input2.equals(notAlive))
			System.out.println("\nbillboard");
		
		if(input.equals(both) && input2.equals(notAlive))
			System.out.println("\nCellPone");

		if(input.equals(both) && input2.equals(alive))
			System.out.println("\nDog");
		
		if(input.equals(inside) && input2.equals(notAlive))
			System.out.println("\nShower curtain");
		
		if(input.equals(inside) && input2.equals(alive))
			System.out.println("\nHouse plant");
		
		keyboard.close();
	}
}
