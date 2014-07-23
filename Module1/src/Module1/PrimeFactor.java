package Module1;

/**
 * Created by brandonsmith on 7/16/14.
 */
import java.util.ArrayList;

public class PrimeFactor {
    private ArrayList<Integer> factors = new ArrayList<Integer>();

    public void generate(int num) {
        for (int i = 2; i <= num; i++) {
            while (num%i == 0) {
                factors.add(i);
                num /= i;
            }
        }
    }

    public ArrayList getFactors() {
        return factors;
    }

    public static void main(String[] args) {
        PrimeFactor factor = new PrimeFactor();
        factor.generate(30);
        System.out.println("the factors are " + factor.getFactors());
    }
}
