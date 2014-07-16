package Module1;

/**
 * Created by brandonsmith on 7/16/14.
 */
public class NStarsHorizontal {
    public void print_stars(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        NStarsHorizontal printer = new NStarsHorizontal();
        printer.print_stars(6);
    }
}


