import java.text.NumberFormat;
import java.util.*;
import java.io.*;

/**
 * Created by brandonsmith on 7/7/14.
 */

/*
Write a program that chooses a random number between 1 and 100.
Then asks the user to enter a guess. If they guess right then tell them they win,
otherwise tell them if they guessed too high or low. Keep asking the user to guess until they get the right answer.
Use classes to separate the different concerns of this program.

 */

/* this class will take care of prompting the user on the command line
   and parsing the answer for the game
*/

class Helper {

    private String guess;
    private int intGuess;

    public int promptUser() {
        System.out.println("Enter a guess: ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            guess = br.readLine();
            try {
                intGuess = Integer.parseInt(guess);
            } catch (NumberFormatException e) {
                System.out.println("You need to enter a number!");
                return 1000;
            }
        } catch (IOException e) {
            System.out.println("There was an error reading your guess!");
            System.exit(1);
        }
        return intGuess;
    }
}

public class GuessGame {
    private int goal;

    public GuessGame() {
        goal = (int) ((Math.random() * 100) + 1); // returns a number between 1 and 100
    }

    public boolean compareGuess(int guess) {
        if(guess==goal) {
            System.out.println("Great guess! That's right!");
            return true;
        } else if (guess > goal) {
            System.out.println("Nice try. You guessed too high");
        } else if (guess < goal) {
            System.out.println("Nice try. You guessed too low");
        }
        return false;
    }
}

class Main {
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        boolean isCorrect = false;
        int guess;

        while(!isCorrect) {
            // ask user for input
            Helper prompter = new Helper();
            guess = prompter.promptUser();

            // 1000 is our "escape" code for an incorrect input of a non-number
            // we don't want to display the usual messages if there is an incorrect input
            if(guess != 1000) {
                // compare input to the "goal" number
                isCorrect = game.compareGuess(guess);
            }
            // repeat until isCorrect is true
        }
        System.out.println("Thanks for playing!");
    }
}