public class Game {
    private String randomChoice;
    private String userInput;
    private String computerMove;

    public Game(String choice){
        userInput = choice;
    }

    public String computerMove(){
        int a = (int)Math.random() * 3;
        String b;
        if (a == 0){
            b = "rock";
        } else if (a == 1){
            b = "paper";
        }else{
            b = "Scissors";
        }
        return b;
    }

    public String decision(String computerChoice){
        String a;
        if (userInput.equals(computerChoice)){
            a = "It's a tie";
        }else if(userInput.equals("rock") && computerChoice.equals("paper")){
            a = "You lose";
        }else if(userInput.equals("rock") && computerChoice.equals("scissors")){
            a = "You win";
        }else if(userInput.equals("paper") && computerChoice.equals("rock")){
            a = "You win";
        }else if(userInput.equals("paper") && computerChoice.equals("scissor")){
            a = "You lose";
        }else if(userInput.equals("scissor") && computerChoice.equals("rock")){
            a = "You lose";
        }else{a = "You win";
        }
        return a;
    }
}
