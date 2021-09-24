import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String playerWelcome = "Welcome, we're gonna play some R, P, S today. Better know as Rock, Paper, Scissors ";
        System.out.println(playerWelcome);


        String choosePlayMode = "Press 1 for singlePlayer - press 2 for multiplayer:";
        System.out.println(choosePlayMode);
        int singlePlayerOrMultiplayer = sc.nextInt();

        if (singlePlayerOrMultiplayer == 1) {
            singlePlayer();
        } else if (singlePlayerOrMultiplayer == 2) {
            multiPlayer();
        } else {
            System.out.println("Your choice is not possible, please use 1 or 2");
        }

    }

    public static void singlePlayer(){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String introForSinglePlayer = "Welcome to R, P, S game. - You chose to play singleplayer.";

        System.out.println(introForSinglePlayer);

        System.out.println("What is your name:");

        String singlePlayerName = sc.next();

        String singlePlayerWelcome = "Hey " + singlePlayerName + "lets play";

        System.out.println(singlePlayerWelcome);

        String [] optionsInGame = {"1. Rock", "2. Paper", "3. Scissors"};

        System.out.println("Please type the number you want to play:");

        for (String option : optionsInGame) {
            System.out.println(option);
        }

        int rock = 1;
        int paper = 2;
        int scissors = 3;

        int singlePlayerPlay;
        int computerPlay;

        singlePlayerPlay = sc.nextInt();
        computerPlay = random.nextInt(3)+1;

        System.out.println(singlePlayerName + " you chose " + singlePlayerPlay);
        System.out.println("The computer chose " + computerPlay);

        if (singlePlayerPlay == computerPlay){
            System.out.println("It's a draw");
        } else if (singlePlayerPlay == rock && computerPlay == scissors || singlePlayerPlay == paper && computerPlay == rock || singlePlayerPlay == scissors && computerPlay == paper ){
            System.out.println(singlePlayerName + " you won.");
        } else {
            System.out.println("The computer won.");
        }

    }

    public static void multiPlayer (){
        Scanner sc = new Scanner(System.in);

        String introForMultiplayer = "Welcome to R, P, S game. - You chose to play multiplayer.";
        System.out.println(introForMultiplayer);

        System.out.println("Name of player 1:");
        String playerOne = sc.next();
        System.out.println("Name of player 2:");
        String playerTwo = sc.next();

        int rock = 1;
        int paper = 2;
        int scissors = 3;

        int playerOnePlay;
        int playerTwoPlay;

        String [] optionsInGame = {"1. Rock", "2. Paper", "3. Scissors"};


        System.out.println(playerOne + " you choose first.");
        System.out.println("Please type the number you want to play: ");

        for (String option : optionsInGame) {
            System.out.println(option);
        }

        playerOnePlay = sc.nextInt();

        System.out.println(playerTwo + " now it's your turn.");
        System.out.println("Please type the number of your choice: ");

        for (String option : optionsInGame) {
            System.out.println(option);
        }

        playerTwoPlay = sc.nextInt();

        System.out.println(playerOne + " you chose " + playerOnePlay);
        System.out.println(playerTwo + " you chose " + playerTwoPlay);

        if (playerOnePlay == playerTwoPlay){
            System.out.println("Draw");
        } else if (playerOnePlay == rock && playerTwoPlay == scissors || playerOnePlay == paper && playerTwoPlay == rock || playerOnePlay == scissors && playerTwoPlay == paper ){
            System.out.println(playerOne + " won.");
        } else {
            System.out.println(playerTwo + " won.");
        }


    }


}