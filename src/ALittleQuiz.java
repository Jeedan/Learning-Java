import java.util.Scanner;


public class ALittleQuiz {
	public ALittleQuiz(){
		Scanner keyboard = new Scanner(System.in);

		int choice = 0;
		int correctAnswers = 0;
		
		String question1 = "What is the capital of Alaska?\n"
				+ 			"1) Melbourne\n"
				+ 			"2) Anchorage\n"
				+ 			"3) Juneau";
		

		String question2 = "Can you store the value \"cat\" in a variable of type int?\n"
				+ 			"1) yes\n"
				+ 			"2) no\n";
		
		
		String question3 = "What is the resut of 9+6/3?\n"
				+ 			"1) 5\n"
				+ 			"2) 11\n"
				+ 			"3) 15/3";

		String wrong1 = "Sorry that is wrong.\n";
		String wrong2 = "Sorry \"cat\" is a string, ints can only store numbers.\n";
		String correct1 = "That's right!\n";
		String correct2 = "That's correct!\n";
		
		// beginning of the program
		System.out.println("Are you ready for a quiz?");
		System.out.println("Ok here it comes!");
		System.out.println("Answering by inputing the multiple choice number!\n");
		
		// question 1
		System.out.println(question1);
		choice = keyboard.nextInt();
		
		if(choice == 3){
			System.out.println(correct1);
			correctAnswers++;
		}
		else{
			System.out.println(wrong1);
		}
		
		// question 2
		System.out.println(question2);
		choice = keyboard.nextInt();
		if(choice == 2){
			System.out.println(correct1);
			correctAnswers++;
		}
		else{
			System.out.println(wrong2);
		}

		// question 3
		System.out.println(question3);
		choice = keyboard.nextInt();
		if(choice == 2){
			System.out.println(correct2);
			correctAnswers++;
		}
		else{
			System.out.println(wrong1);
		}
		
		System.out.println("Overall, you got " + correctAnswers + " out of 3 correct.\nThanks for playing!");
		keyboard.close();
	}
}
