/**
 * Created by brandonsmith on 7/7/14.
 */

// Objective: Print the sum of all odd numbers from 1 to 100
public class OddSummation {
    public static void main(String[] args) {

        // initialize our sum variable
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if(i%2 == 1){
                sum+=i;
            }
        }
        System.out.println("The sum of odd numbers from 1 to 100 is "+sum);
    }
}
