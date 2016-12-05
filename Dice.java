package se.Henrik;

/**
 * Created by Henrik on 2015-11-07.
 */

public class Dice implements Comparable<Dice> {
    private int Value;
    private final int MAX = 6;

    public Dice() {
        Value = 1;
        roll();
    }

    public void roll() {
        Value = (int) (Math.random() * MAX) + 1;
    }

    public int getValue() {
        return Value;
    }

    public String toString() {
        return "Dice: " + getValue();
    }

    @Override
    public int compareTo(Dice otherDice) {
        int difference = this.getValue() - otherDice.getValue();
        return difference;
    }
}