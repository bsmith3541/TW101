/**
 * Created by brandonsmith on 7/7/14.
 */

class IncrementCounter {
    int numIncrementCalls;

    public IncrementCounter() {
        numIncrementCalls = 0;
    }
    public void increment() {
        numIncrementCalls++;
    }
    public void total() {
        System.out.println("increment() was called a total of "+numIncrementCalls+" times.");
    }
}
public class Main {
    public static void main(String[] args) {
        IncrementCounter counter = new IncrementCounter();
        for (int i = 0; i < 5; i++) {
            counter.increment();
        }
        counter.total();
    }
}
