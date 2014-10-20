import java.util.Scanner;


public class TinyAdventure {
	Scanner keyboard;
	String ch1;
	
	String house;
	String kitchen;
	String refrigerator;
	String cabinet;
	String upstairs;
	String bedroom;
	String bathroom;
	String starve;
	String neverKnow;
	
	public TinyAdventure(){
		keyboard = new Scanner(System.in);
		
		house = "You are in a creepy house!\nWould you like to go \"upstairs\" or into the \"kitchen\"?";
		kitchen = "There is a long countertop with dirty dishes everywhere.\n"
				+ "Off to one side there is, as you\'d expect, a refrigerator."
				+ "\nYou may open the \"refrigerator\" or look in a \"cabinet\".";
		
		refrigerator = "Inside the refrigerator you see food and stuff."
				+ "\nIt looks pretty nasty."
				+ "\nWould you like to eat some of the food? (\"yes\" or \"no\")";
		cabinet = "THERE IS A SPOOKY GHOST INSIDE AND IT KILLS YOU!\n";
		upstairs = "\nUpstairs you see a hallway.  At the end of the hallway is the master \"bedroom\"."
				+ "\nThere is also a \"bathroom\" off the hallway. Where would you like to go?";
		bedroom = "\nYou are in a plush bedroom, with expensive-looking hardwood furniture."
				+ "\nThe bed is unmade.  In the back of the room, the closet door is ajar.\nWould you"
				+ "like to open the door? (\"yes\" or \"no\")";
		bathroom = "\nA slime monster kills you because I am done making if-elseif chains...\n";
		starve = "\nYou die of starvation...eventually.\n";
		neverKnow = "\nWell, then I guess you'll never know what was in there.\nThanks for playing,"
				+ "\nI'm tired of making nested if statements.\n";

		StartAdventure();
		keyboard.close();
	}
	
	private void PlayAgain(){
		System.out.println("Play again? y/n.");
		ch1 = keyboard.next();
		if(ch1.equals("y"))
			StartAdventure();
		else if( ch1.equals("n"))
			System.out.println("Thanks for playing!");
	}
	public void StartAdventure(){
		// start of the adventure
		System.out.println("WELCOME TO MITCHELL\'S TINY ADVENTURE!\n");

		System.out.println(house);
		ch1 = keyboard.next();
		// chose to go to the kitchen
		if(ch1.equals("kitchen")){
			System.out.println(kitchen);
			ch1 = keyboard.next();
			if(ch1.equals("refrigerator")){
				// chose to open the refrigerator
				System.out.println(refrigerator);
				ch1 = keyboard.next();
				if(ch1.equals("yes"))
					System.out.println("You eat the food, it was nasty...you die a few days later due to food poisoning.");				
				else if( ch1.equals("no")){
					System.out.println(starve);
				    PlayAgain();
				}
				else {
					System.out.println("Unknown command, please only enter a word that was in quotations as your choice");		
					PlayAgain();
				}
			}
			else if (ch1.equals("cabinet")){
				System.out.println(cabinet);// chose to open the cabinet	
				PlayAgain();
			}
			else  {
				System.out.println("Unknown command, please only enter a word that was in quotations as your choice");		
				PlayAgain();
			}
		} 
		else if(ch1.equals("upstairs")){
			// chose to go upstairs
			System.out.println(upstairs);
			ch1 = keyboard.next();
			if(ch1.equals("bedroom")){
				System.out.println(bedroom);
				ch1 = keyboard.next();
				if(ch1.equals("yes")){
					System.out.println("You find Harry Potter, good job.");
					PlayAgain();
				}
				else if( ch1.equals("no")){
					System.out.println(neverKnow);
					PlayAgain();
				}
				else  {
					System.out.println("Unknown command, please only enter a word that was in quotations as your choice");		
					PlayAgain();
				}
			}
			else if(ch1.equals("bathroom")){
				System.out.println(bathroom);
				PlayAgain();
			}
			else  {
				System.out.println("Unknown command, please only enter a word that was in quotations as your choice");		
				PlayAgain();
			}
		}
		else {
			System.out.println("Unknown command, please only enter a word that was in quotations as your choice");
			PlayAgain();
		}
	}
}
