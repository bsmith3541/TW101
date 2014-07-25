package GuessAgain;

/**
 * Created by brandonsmith on 7/25/14.
 */
public class Main {

    public static void main(String[] args) {
        GuessAgain game = new GuessAgain();
        UserInputHelper helper = new UserInputHelper();
        boolean isCorrect = false;
        String guess;
        int intGuess;

        while(!isCorrect) {
            guess = helper.promptUser();
            try {
                // first we make sure the input was actually a number
                intGuess = Integer.parseInt(guess);

                // if the input is a number, we add it to our ArrayList
                // parseInt turns the String into an int,
                // so we need to return it to its string form
                System.out.println(guess);
                game.addGuess(guess.toString());


                // compare input to the "goal" number
                isCorrect = game.compareGuess(intGuess);

            } catch (NumberFormatException e) {
                System.out.println("You must enter a number!");
            }

            // repeat until isCorrect is true
        }
        System.out.println("Thanks for playing! Here are you guesses: ");
        game.getGuesses();
    }
}
