package main;

/**
 * Created by brandonsmith on 7/24/14.
 */
public class Franc extends Money {

    public Franc(int amount, String currency) {
       super(amount, currency);
    }

    public Money times (int multiplier) {
        return new Franc(amount * multiplier, currency);
    }

    public String currency() {
        return currency;
    }

    public static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

}
