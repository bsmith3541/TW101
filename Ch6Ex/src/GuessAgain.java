import java.io.*;
import java.util.*;
import java.text.NumberFormat;
/**
 * Created by brandonsmith on 7/9/14.
 */
/* Objective
Create a new version of the Chapter 5 problem where you also record all of the users guesses
print them out once they guess correctly. Use an ArrayList to store the guesses.
 */
public class GuessAgain {
    private int goal;
    private ArrayList<String> guesses = new ArrayList<String>();

    public GuessAgain() {
        goal = (int) ((Math.random() * 100) + 1); // returns a number between 1 and 100
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

    public void getGuesses() {
        for (int i = 0; i < guesses.size(); i++) {
            System.out.println("" + guesses.get(i));
        }
    }
}

class Helper {

    private String guess;

    public String promptUser() {
        System.out.println("Enter a guess: ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            guess = br.readLine();
        } catch (IOException e) {
            System.out.println("There was an error reading your guess!");
            System.exit(1);
        }
        return guess;
    }
}

class Main {

    public static void main(String[] args) {
        GuessAgain game = new GuessAgain();
        Helper helper = new Helper();
        boolean isCorrect = false;
        String guess;
        int intGuess;

        while(!isCorrect) {
            guess = helper.promptUser();
            try {
                // first we make sure the input was actually a number
                intGuess = Integer.parseInt(guess);

                // if the input is a number, we added to our ArrayList
                // parseInt turns the String into an int,
                // so we need to return it to its string form
                System.out.println(guess);
                game.addGuess(guess.toString());

                // finally we check the guess
                if(intGuess != 1000) {
                    // compare input to the "goal" number
                    isCorrect = game.compareGuess(intGuess);
                }
            } catch (NumberFormatException e) {
                System.out.println("You must enter a number!");
            }

            // repeat until isCorrect is true
        }
        System.out.println("Thanks for playing! Here are you guesses: ");
        game.getGuesses();
    }
}
