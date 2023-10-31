public class Game {
    private String randomChoice;
    private String userInput;
    private String computerMove;




    public Game(String choice){
        userInput = choice;
    }




    public String computerMove(){
        int a = (int)(Math.random() * 5);
        String b;
        if (a == 0){
            b = "rock";
        } else if (a == 1){
            b = "paper";
        }else if (a == 2){
            b = "scissors";
        }else if(a == 3){
            b = "spock";
        }else{
            b = "lizard";
        }
        return b;
    }




    public String decision(String computerChoice) {
        String a;
        if (userInput.equals(computerChoice)) {
            a = "It's a tie";
        } else if (userInput.equals("rock") && computerChoice.equals("paper")) {
            a = "You lose";
        } else if (userInput.equals("rock") && computerChoice.equals("scissors")) {
            a = "You win";
        } else if (userInput.equals("rock") && computerChoice.equals("spock")) {
            a = "You lose";
        } else if (userInput.equals("rock") && computerChoice.equals("lizard")) {
            a = "You win";
        } else if (userInput.equals("paper") && computerChoice.equals("rock")) {
            a = "You win";
        } else if (userInput.equals("paper") && computerChoice.equals("scissor")) {
            a = "You lose";
        } else if (userInput.equals("paper") && computerChoice.equals("spock")) {
            a = "You lose";
        } else if (userInput.equals("paper") && computerChoice.equals("lizard")) {
            a = "You lose";
        } else if (userInput.equals("scissor") && computerChoice.equals("rock")) {
            a = "You lose";
        } else if (userInput.equals("scissor") && computerChoice.equals("paper")) {
            a = "You win";
        } else if (userInput.equals("scissor") && computerChoice.equals("spock")) {
            a = "You lose";
        } else if (userInput.equals("scissor") && computerChoice.equals("lizard")) {
            a = "You win";
        } else if (userInput.equals("scissor") && computerChoice.equals("paper")) {
            a = "You win";
        } else if (userInput.equals("lizard") && computerChoice.equals("paper")) {
            a = "You win";
        } else if (userInput.equals("lizard") && computerChoice.equals("rock")) {
            a = "You lose";
        } else if (userInput.equals("lizard") && computerChoice.equals("spock")) {
            a = "You win";
        } else if (userInput.equals("lizard") && computerChoice.equals("scissor")) {
            a = "You lose";
        } else if (userInput.equals("spock") && computerChoice.equals("paper")) {
            a = "You lose";
        } else if (userInput.equals("spock") && computerChoice.equals("rock")) {
            a = "You win";
        } else if (userInput.equals("spock") && computerChoice.equals("lizard")) {
            a = "You lose";
        } else{
            a = "You win";
        }
        return a;
    }
}
