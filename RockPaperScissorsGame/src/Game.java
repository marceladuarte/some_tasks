import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Game {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Rock paper scissors Game");
		System.out.println("Let's play! Choose 1 to Rock, 2 to Paper or 3 to Scissor");
		
		play();
		
	}

	private static void play() {
		int playerChoice = 0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Choose a number: ");
		String console = "";
		try {
			console = in.readLine();
		} catch (IOException e) {
			System.out.println("A problem occured: " + e.getMessage());
			System.out.println("Try again!");
			play();
		}
		
		if(console != null && !console.isEmpty() && 
				console.equals("1") || console.equals("2") || console.equals("3")){
			try {
				playerChoice = Integer.valueOf(console);
			} catch (Exception e) {
				System.out.println("Choose a valid option!");
				play();
			}
			
		}else{
			System.out.println("Choose a valid option!");
			play();
		}
		
		Random choice = new Random(); 
		int computerChoice = choice.nextInt(3)+1;
		System.out.println("Your choice: " + translateChoice(playerChoice));
		System.out.println("Computer choice: " + translateChoice(computerChoice));
		whoWins(playerChoice, computerChoice);
		play();
	}

	private static void whoWins(int playerChoice, int computerChoice) {
		if(playerChoice == computerChoice){
			System.out.println("Tye!");
		}else if((playerChoice == 1 && computerChoice == 3) ||
			 (playerChoice == 2 && computerChoice == 1) ||
			 (playerChoice == 3 && computerChoice == 2)){
			System.out.println("You won!");
		}else {
			System.out.println("Computer won!");
		}
		
	}
	
	private static String translateChoice(int choice){
		String choiceName = "";
		switch (choice) {
			case 1:
				choiceName = "Rock";
				break;
			case 2:
				choiceName = "Paper";
				break;
			case 3:			
				choiceName = "Scissor";
				break;
		}
		return choiceName;
	}
}
