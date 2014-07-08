import java.util.*;

/**
 * Created by brandonsmith on 7/7/14.
 */

/*
Write a program that chooses a random number between 1 and 100.
Then asks the user to enter a guess. If they guess right then tell them they win,
otherwise tell them if they guessed too high or low. Keep asking the user to guess until they get the right answer.
Use classes to separate the different concerns of this program.

 */
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
        while(!isCorrect) {
            // ask user for input
            // compare input to the "goal" number
            // repeat until isCorrect is true
        }
    }
}