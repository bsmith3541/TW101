package main;

/**
 * Created by brandonsmith on 7/24/14.
 */
public class Money implements Expression{
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && currency().equals(money.currency());
    }

    public Expression times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

   public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    public String currency(){
        return currency;
    }

    public String toString() {
        return amount + " " + currency;
    }

    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public Money reduce(Bank bank, String to) {
        int rate = (currency.equals("CHF") & to.equals("USD")) ? 2 : 1;
        return new Money(amount/rate, to);
    }
}
