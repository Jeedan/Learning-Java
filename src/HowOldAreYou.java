import java.util.Scanner;


public class HowOldAreYou {
	public HowOldAreYou(){
		Scanner keyboard  = new Scanner(System.in);
		
		String cantDrive = 	"You can't drive.";
		String canDriveNotVote ="You can drive but not vote.";
		String VoteButNoRentCar = "You can vote but not rent a car.";
		String youCanDoAnything = "You can do pretty much anything.";
		
		String name;
		int age; 
		System.out.println("What is your name? ");
		name = keyboard.next();
		System.out.println("Ok "+ name + ", how old are you? ");
		age = keyboard.nextInt();

		System.out.println("");
		
		if(age < 16)
			System.out.println(cantDrive);
		else if(age > 15 && age < 18)
			System.out.println(canDriveNotVote);
		else if(age > 17 && age < 25)
			System.out.println(VoteButNoRentCar);
		else
			System.out.println(youCanDoAnything);
		keyboard.close();
/*
		less than 16	"You can't drive."
		16 to 17	"You can drive but not vote."
		18 to 24	"You can vote but not rent a car."
		25 or older	"You can do pretty much anything."
*/
	}
}
