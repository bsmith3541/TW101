package GuessAgain;

import java.util.*;

/**
 * Created by brandonsmith on 7/9/14.
 */
/* Objective
Create a new version of the Chapter 5 problem where you also record all of the users guesses
print them out once they guess correctly. Use an ArrayList to store the guesses.
 */
public class GuessAgain {
    private int goal;
    private ArrayList<String> guesses;

    public GuessAgain() {
        goal = (int) ((Math.random() * 100) + 1); // returns a number between 1 and 100
        guesses = new ArrayList<String>();
    }

    public boolean compareGuess(int guess) {
        if (guess == goal) {
            System.out.println("Great guess! That's right!");
            return true;
        } else if (guess > goal) {
            System.out.println("Nice try. You guessed too high");
        } else if (guess < goal) {
            System.out.println("Nice try. You guessed too low");
        }
        return false;
    }

    public void addGuess(String guess) {
        guesses.add(guess);
    }

    public void printGuesses() {
        for (int i = 0; i < guesses.size(); i++) {
            System.out.println("" + guesses.get(i));
        }
    }
}

