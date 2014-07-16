package Module1;

/**
 * Created by brandonsmith on 7/16/14.
 */
public class RightTriangle {
    public void print_triangle(int num) {
        for (int i = 0; i < num; i++) {
            for(int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        RightTriangle right = new RightTriangle();
        right.print_triangle(5);
    }
}
