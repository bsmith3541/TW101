package Module1;

/**
 * Created by brandonsmith on 7/16/14.
 */
public class Diamond {
    public void print_diamond(int height) {
        print_top(height);
        print_bottom(height);
    }

    private void print_top(int height) {
        for(int i = 0; i < height; i++) {
            print_spaces(height - (i + 1));
            print_stars((2*i) + 1);
            print_spaces(height - (i+1));
            System.out.println();
        }

    }

    private void print_bottom(int height) {
       for(int i = 0; i < height; i++) {
            print_spaces(i + 1);
            print_stars((2*height) - (2 * (i+1)+1));
            print_spaces(i + 1);
            System.out.println();
       }
    }
    private void print_spaces(int spaces) {
        for(int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
    }

    private void print_stars(int stars) {
        for (int i = 0; i < stars; i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        Diamond diamond = new Diamond();
        diamond.print_diamond(7);
    }
}
