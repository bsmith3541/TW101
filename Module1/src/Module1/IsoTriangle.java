package Module1;

/**
 * Created by brandonsmith on 7/16/14.
 */
public class IsoTriangle {
    public void print_triangle(int base) {
        for(int i = 0; i < base; i++) {
            print_spaces(i+1, base);
            print_stars(i+1);
            print_spaces(i+1, base);
            System.out.println();
        }
    }

    private void print_spaces(int line, int base) {
        // always print the base - line of spaces
        // e.g. line 1 of a base 3 has 2 spaces
        for(int i = 0; i < base - line; i++) {
            System.out.print(" ");
        }
    }

    private void print_stars(int line) {
        // always print 2 * line - 1 stars
        for (int i = 0; i < (2*line) -1; i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        IsoTriangle triangle = new IsoTriangle();
        triangle.print_triangle(3);
    }
}
