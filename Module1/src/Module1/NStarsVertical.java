package Module1;

/**
 * Created by brandonsmith on 7/16/14.
 */
public class NStarsVertical {

    public void print_stars(int num) {
        for(int i = 0; i < num; i++) {
            System.out.println("*");
        }
    }

    public static void main(String[] args) {
        NStarsVertical vert = new NStarsVertical();
        vert.print_stars(3);
    }
}
