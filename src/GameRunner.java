import java.util.Scanner;
public class GameRunner{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome to Rock, Paper, Scissors, Spock, Lizard!\nRock beats Scissors and Lizards. Scissors beat Paper and Lizards. Paper beats Rock and Spock. Lizard beats Paper and Spock. Spock beats Rock and Scissors." +
                "The computer has chosen. What's your choice? (rock, paper, scissors, spock, or lizard)\nYour choice: ");
        String choice = scan.nextLine();
        Game game = new Game(choice);
        String computerChoice = game.computerMove();
        System.out.println("Computer chose: " + computerChoice);
        System.out.print(game.decision(computerChoice));
    }
}


