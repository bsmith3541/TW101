package main;

/**
 * Created by brandonsmith on 7/24/14.
 */
public interface Expression {
    Money reduce(Bank bank, String to);
    Expression plus(Expression addend);
    Expression times(int multiplier);
}
