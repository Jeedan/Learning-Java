import java.util.Scanner;


public class TwentyQuestions {
	public TwentyQuestions(){
		Scanner keyboard = new Scanner(System.in);
		String q1 = "Question 1) Is it animal, vegetable, or mineral?";
		String q2 = "\nQuestion 2) Is it bigger than a breadbox?";
		
		String answer;	
		String answer2;
		
		System.out.println("TWO QUESTIONS!\nThink of an object, and I'll try to guess it.\n");
		System.out.println(q1);
		answer = keyboard.next();
		System.out.println(q2);
		answer2 = keyboard.next();
		
		if(answer.equals("animal")){
			if(answer2.equals("no") || answer2.equals("n") || answer2.equals("NO") || answer2.equals("No")){
				System.out.println("\nMy guess is that you are thinking of a mouse.\n");
				System.out.println("I would ask you if I'm right, but I don't actually care.\n");
			}
			else if(answer2.equals("yes") || answer2.equals("y") || answer2.equals("YES") || answer2.equals("Yes")){
				System.out.println("\nMy guess is that you are thinking of a moose.\n");
				System.out.println("I would ask you if I'm right, but I don't actually care.\n");
			}
		}
		
		if(answer.equals("vegetable")){
			if(answer2.equals("no") || answer2.equals("n") || answer2.equals("NO") || answer2.equals("No")){
				System.out.println("\nYou're thinking of a carrot!\n");
				System.out.println("I would ask you if I'm right, but I don't actually care.\n");
			}
			else if(answer2.equals("yes") || answer2.equals("y") || answer2.equals("YES") || answer2.equals("Yes")){
				System.out.println("\nMy guess is that you are thinking of a pumpkin.\n");
				System.out.println("I would ask you if I'm right, but I don't actually care.\n");
			}
		}
		
		if (answer.equals("mineral")){
			if(answer2.equals("no") || answer2.equals("n") || answer2.equals("NO") || answer2.equals("No")){
				System.out.println("\nMy guess is that you are thinking of a paper clip.\n");
				System.out.println("I would ask you if I'm right, but I don't actually care.\n");
			}
			else if(answer2.equals("yes") || answer2.equals("y") || answer2.equals("YES") || answer2.equals("Yes")){
				System.out.println("\nMy guess is that you are thinking of a truck.\n");
				System.out.println("I would ask you if I'm right, but I don't actually care.\n");
			}
		}
		// ask question 2
		
		keyboard.close();
	}
}
