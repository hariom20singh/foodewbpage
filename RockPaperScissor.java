import java.util.*;

public class RockPaperScissor{
	
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			
		//1. RANDOMIZED COMPUTER MOVE
		
			// array of string containing available moves.
			String [] availableMoves = {"Rock", "Paper", "Scissors"};
		
			// using Random() function on indices of array so that it chooses a random move.
			String computerMove = availableMoves[new Random().nextInt(availableMoves.length)];
		
			System.out.println("Computer has chosen it's move.");
			System.out.println();
			System.out.println("Now it's your turn to choose. Good Luck!");
			System.out.println();
		
		//2. PLAYER MOVE
		
			//input
			String userMove;
		
			// loop until the user chooses the correct move
			while(true) {
				System.out.println("Please choose your move from these available moves : 'Rock' 'Paper' 'Scissors' ");
				System.out.println("Enter the move you chose : ");
				userMove = scn.nextLine();
			
				// checking if user's move is one of the available moves or not
				if(userMove.equals("Rock") || userMove.equals("Paper") || userMove.equals("Scissors")){
					System.out.println();
					break;
				}
			
				// if user didn't enter a valid input
				System.out.println();
				System.out.println("Invalid Move!!");
				System.out.println("Please enter the move from the available moves only!");
				System.out.println();
			}
		
			//printing what computer chose
			System.out.println("Computer chose : " + computerMove);
		
		//3. COMPARING THE MOVES & DECIDING THE WINNER
		
			// checking for a tie
		
			if(userMove.equals(computerMove)) {
				System.out.println("Its a tie!");
			}
		
			//checking for all other moves possible
		
			else if(userMove.equals("Rock")) {
			
				if(computerMove.equals("Paper")) {
					System.out.println("Computer won!");
					System.out.println("Better luck next time!");
				} 
				else if(computerMove.equals("Scissors")) {
					System.out.println("You won!");
					System.out.println("Congratulations!");
				}
			}
		
			else if(userMove.equals("Paper")) {
			
				if(computerMove.equals("Rock")) {
					System.out.println("You won!");
					System.out.println("Congratulations!");
				} 
				else if(computerMove.equals("Scissors")) {
					System.out.println("Computer won!");
					System.out.println("Better luck next time!");
				}
			}
		
			else if(userMove.equals("Scissors")) {
			
				if(computerMove.equals("Paper")) {
					System.out.println("You won!");
					System.out.println("Congratulations!");
				} 
				else if(computerMove.equals("Rock")) {
					System.out.println("Computer won!");
					System.out.println("Better luck next time!");
				}
			}
			
			System.out.println();
			String playAgain;
			System.out.println("Do you want to play again? ");
			
			// loop until the user chooses the correct option
			while(true) {
				
				System.out.println("Type 'yes' or 'no' ");
				playAgain = scn.nextLine();
				
				if(playAgain.equals("yes") || playAgain.equals("Yes") || playAgain.equals("no") || playAgain.equals("No")) {
					System.out.println();
					System.out.println("*****************************************************************************");
					System.out.println();
					break;
				}
				System.out.println();
				System.out.println("Invalid Input");
				System.out.println();
			}
			
			if(playAgain.equals("no") || playAgain.equals("No")) {
				break;
			}
		}
	}
}