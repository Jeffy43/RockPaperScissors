import java.util.Scanner;
public class GameRunner{
    Scanner scan = new Scanner(System.in);
    public void main(String[] args){
        System.out.print("Welcome to Rock, Paper, Scissors!\nRock beats Sissorcs. Sissors beat paper. Paper beats Rock." +
                "The computer has chosen. What's your choice? (rock, paper or scissors)\nYour choice: ");
        String choice = scan.nextLine();
        Game game = new Game(choice);
        String computerChoice = game.computerMove();
        System.out.print("Computer chose: " + computerChoice);
        System.out.print(game.decision(computerChoice));
    }
}
