/**
 * Created by brandonsmith on 7/7/14.
 */
public class IncrementTesting {
    public static void main(String[] args) {
       int x = 0;

       // here x is 0
       System.out.println("x is "+ x++);
       // after the above print executes, x becomes 1
       System.out.println("now x is "+ ++x);
       // before the print executes, the new value of x is 2
    }
}
