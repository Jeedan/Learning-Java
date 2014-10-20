package com.pokemon.console.game;

import java.util.Random;
import java.util.Scanner;

public class PokemonGame {
	static int playerHealth;
	static int opponentHealth;
	
	// move list 1
	static int tackle;
	static int thunderShock;
	static int growl;
	static int quickAttack;
	
	// move list 2
	static int bite;
	static int lifeLeech;
	static int superSonic;
	static int turn = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		playerHealth = 100;
		opponentHealth = 100;
		
		tackle = 30;
		thunderShock = 60;
		growl = 0;
		quickAttack = 40;
		bite = 50;
		lifeLeech = 10;
	 	superSonic = 0;
	 	
		final int fight = 1;
		final int pokemon = 2;
		final int items = 3;
		// exit conditions
		final int run = 4;
		final int win = 100;
		final int loss = -100;
		
		String playerTurn = "1)Fight\t"
				+ "2)Pokemon\n"
				+ "3)Items\t"
				+ "4)Run  ";
		
		String moveList = "1)Tackle\t"
				+ "2)Growl\n"
				+ "3)Thundershock\t"
				+ "4)QuickAttack  ";
		
		int playerChoice = 0;

		System.out.print("Enter a negative number to exit the game if you are too scared!!\n");
		System.out.print("Encountered a wild Zubat!\n");
		System.out.print("\n"); // line break 
	
		boolean endBattle = false;
		boolean endFight = false;
		PlayerTurnMenu(playerTurn);
		playerChoice = keyboard.nextInt();
		while (!endBattle){
			
			switch (playerChoice) {
			case fight:
				System.out.println("Pick a move!");
				System.out.println(moveList);
				playerChoice = keyboard.nextInt();
				PlayerMoveChoice(playerChoice);
				if(playerChoice > 4){
					System.out.println("Pick a move!");
					System.out.println(moveList);
					playerChoice = keyboard.nextInt();
					PlayerMoveChoice(playerChoice);
					EnemyMoveChoice();
				}else 
					EnemyMoveChoice();
		
				break;
			case pokemon:
				System.out.println("Later you will be able to switch Pokemans, just not yet!");
				PlayerTurnMenu(playerTurn);
				break;
			case items:
				System.out.println("Later you will be able to use items, just not yet!");
				PlayerTurnMenu(playerTurn);
				playerChoice = keyboard.nextInt();
				break;
			case run:
				endFight = true;
				break;
			default:
				break;
			}
			
			if(opponentHealth < 0){
				DrawWin(); // redraw the battleField
				playerChoice = win;
				endFight = true;
			}
			
			if(playerHealth < 0){
				playerChoice = loss;
				DrawLoss(); // redraw the battleField
				endFight = true;
			}
			
			if(!endFight){
				turn++;
				PlayerTurnMenu(playerTurn);
				playerChoice = keyboard.nextInt();
			}
			
			if(endFight){	
				if(playerChoice == win){
					System.out.println("You defeated Zubat!");
					System.out.println("Pikachu earned 50 exp.");
				}
				
				if(playerChoice == loss){
					System.out.println("Pikachu fainted...");
					System.out.println("You have no other Pokemon left to battle with.");
					System.out.println("You faint and Zubat mugs you.");
					System.out.println("You lose P$500.");
				}
				
				if(playerChoice == run){
					System.out.println("You ran from the battle!");
				}
				
				System.out.println("\nFight again? y/n");
				String input = keyboard.next();
				if(input.equals("y")){
					ResetBattle();
					endFight = false;
					PlayerTurnMenu(playerTurn);
					playerChoice = keyboard.nextInt();
				}
				
				if(input.equals("n")){
					endBattle = true;
					endFight = true;
				}
			}
		}
			
		if(endBattle)
			System.out.println("Bye!");
			
		keyboard.close();
	}
	
	private static void ResetBattle(){
		opponentHealth = 100;
		playerHealth = 100;
		turn = 1;
	}

	private static void PlayerTurnMenu(String playerTurn){	
		DrawBattleField(); // redraw the battleField
		System.out.println("Turn: " + turn);
		System.out.println("What will Pikachu do?");
		System.out.println(playerTurn);
	}
	
	private static void EnemyMoveChoice(){
		if(opponentHealth > 0){
			Random rng = new Random();
			int move = 1 + rng.nextInt(4);
			//move = 2;
			switch(move){
			case 1:
				System.out.println("Zubat used Tackle!");
				System.out.print("\n"); // line break 
				playerHealth = DealDamage(playerHealth, tackle);
				break;
			case 2:
				System.out.println("Zubat used Lifeleech!");
				System.out.print("\n"); // line break 
				playerHealth = DealDamage(playerHealth, lifeLeech);
				opponentHealth = DealDamage(opponentHealth, -lifeLeech);
				break;
			case 3:
				System.out.println("Zubat used Supersonic!");
				System.out.println("It missed!");
				System.out.print("\n"); // line break 
				break;
			case 4:
				System.out.println("Zubat used Bite!");
				System.out.print("\n"); // line break 
				playerHealth = DealDamage(playerHealth, tackle);
				break;
			default:
				System.out.println("Zubat is confused...");
				System.out.print("\n"); // line break 
				break;
			}
		}
	}
	
	
	private static void PlayerMoveChoice(int choice){
		if (playerHealth > 0) {
			switch (choice) {
			case 1:
				System.out.print("------------------------------------"); // line break 
				System.out.print("\n"); // line break 
				System.out.print("\n"); // line break 
				System.out.println("Pikachu used Tackle!");
				opponentHealth = DealDamage(opponentHealth, tackle);
				break;
			case 2:
				System.out.print("------------------------------------"); // line break 
				System.out.print("\n"); // line break 
				System.out.print("\n"); // line break 
				System.out.println("Pikachu used Growl!");
				opponentHealth = DealDamage(opponentHealth, growl);
				break;
			case 3:
				System.out.print("------------------------------------"); // line break 
				System.out.print("\n"); // line break 
				System.out.print("\n"); // line break 
				System.out.println("Pikachu used Thundershock!");
				System.out.println("It\'s super effective!");
				opponentHealth = DealDamage(opponentHealth, thunderShock);
				break;
			case 4:
				System.out.print("------------------------------------"); // line break 
				System.out.print("\n"); // line break 
				System.out.print("\n"); // line break 
				System.out.println("Pikachu used QuickAttack!");
				opponentHealth = DealDamage(opponentHealth, quickAttack);
				break;
			default:
				break;
			}
		}
	}
	

	private static void DrawWin(){
		/*
		 *  Draw da zubat
		 * */
		DrawOpponentPokemon("Zubat\t lvl 14", ' ');
		/*
		 *  Draw da zubat
		 * */
		/*
		 *  Draw your poke
		 * */
		DrawYourPokemon("Pikachu\t lvl 16", '#');
		/*
		 *  Draw your poke
		 * */
	}	
	
	private static void DrawLoss(){

		/*
		 *  Draw da zubat
		 * */
		DrawOpponentPokemon("Zubat\t lvl 14", '#');
		/*
		 *  Draw da zubat
		 * */
		/*
		 *  Draw your poke
		 * */
		DrawYourPokemon("Pikachu\t lvl 16", ' ');
		/*
		 *  Draw your poke
		 * */
	}
	
	private static void DrawBattleField(){
		/*
		 *  Draw da zubat
		 * */
		DrawOpponentPokemon("Zubat\t lvl 14", '#');
		/*
		 *  Draw da zubat
		 * */
		/*
		 *  Draw your poke
		 * */
		DrawYourPokemon("Pikachu\t lvl 16", '#');
		/*
		 *  Draw your poke
		 * */
	}
	
	private static void DrawYourPokemon(String name, char pokeIcon){
		
		System.out.println("\t\t\t"+ name);

		System.out.print("  "+ pokeIcon);
		
		if(playerHealth >= 100){
			System.out.print("\t\t\tHP [==========]");
		}else if(playerHealth == 90){
			System.out.print("\t\t\tHP [========= ]");
			
		}else if(playerHealth == 80){
			System.out.print("\t\t\tHP [========  ]");
			
		}else if(playerHealth == 70){
			System.out.print("\t\t\tHP [=======   ]");
			
		}else if(playerHealth == 60){
			System.out.print("\t\t\tHP [======    ]");
			
		}else if(playerHealth == 50){
			System.out.print("\t\t\tHP [=====     ]");
			
		}else if(playerHealth == 40){
			System.out.print("\t\t\tHP [====      ]");
			
		}else if(playerHealth == 30){
			System.out.print("\t\t\tHP [===       ]");
			
		}else if(playerHealth == 20){
			System.out.print("\t\t\tHP [==        ]");
			
		}else if(playerHealth == 10){
			System.out.print("\t\t\tHP [=         ]");
			
		}else if(playerHealth <= 0){
			System.out.print("\t\t\tHP [          ]");
			
		}else {
			System.out.print("\t\t\tHP [          ]");
		}
		
		//System.out.print("\t\t\tHP [==========]");
		System.out.print("\n"); // line break 
		System.out.print(""+pokeIcon + pokeIcon + pokeIcon + pokeIcon);
		System.out.print("\n"); // line break 
		System.out.print("  "+ pokeIcon);
		System.out.print("\n"); // line break 
		System.out.print("\n"); // line break 
	}
	
	private static void DrawOpponentPokemon(String name, char pokeIcon){
		System.out.println(name);
		
		if(opponentHealth >= 100){
			System.out.print("HP [==========]");
		}else if(opponentHealth == 90){
			System.out.print("HP [========= ]");
			
		}else if(opponentHealth == 80){
			System.out.print("HP [========  ]");
			
		}else if(opponentHealth == 70){
			System.out.print("HP [=======   ]");
			
		}else if(opponentHealth == 60){
			System.out.print("HP [======    ]");
			
		}else if(opponentHealth == 50){
			System.out.print("HP [=====     ]");
			
		}else if(opponentHealth == 40){
			System.out.print("HP [====      ]");
			
		}else if(opponentHealth == 30){
			System.out.print("HP [===       ]");
			
		}else if(opponentHealth == 20){
			System.out.print("HP [==        ]");
			
		}else if(opponentHealth == 10){
			System.out.print("HP [=         ]");
			
		}else if(opponentHealth <= 0){
			System.out.print("HP [          ]");
			
		}else {
			System.out.print("HP [          ]");
		}
		
		/*
		 *  Draw da zubat
		 * */
		System.out.print("\t\t\t " + pokeIcon);
		System.out.print("\n"); // line break 
		System.out.print("\t\t\t\t" + pokeIcon + pokeIcon + pokeIcon + pokeIcon);
		System.out.print("\n"); // line break 
		System.out.print("\t\t\t\t  " + pokeIcon);
		System.out.print("\n"); // line break 
		System.out.print("\n"); // line break 
		/*
		 *  Draw da zubat
		 * */
	}
	
	private static int DealDamage(int health,int damage){
		if(health > 0)
			return health -= damage;
		else 
			System.out.print("Target has fainted!\n");
		return 0;
	}
}
