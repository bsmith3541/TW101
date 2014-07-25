package GuessAgain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by brandonsmith on 7/25/14.
 */

public class UserInputHelper {
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
