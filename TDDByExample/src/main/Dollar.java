package main;

/**
 * Created by brandonsmith on 7/24/14.
 */
public class Dollar extends Money{

    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    public Money times (int multiplier) {
        return new Dollar(amount * multiplier, currency);
    }

    public String currency() {
        return currency;
    }

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }
}
