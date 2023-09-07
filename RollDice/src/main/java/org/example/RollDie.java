package org.example;

public class RollDie {
    private int initialRoll1;
    private int initialRoll2;
    private int initialRollSum;



/*    public RollDie() {
        initialRoll();
    }*/

    public void initialRoll() {
        initialRoll1 = rollDie();
        initialRoll2 = rollDie();
        initialRollSum = initialRoll1 + initialRoll2;
    }

    public int getInitialRoll1() {
        return initialRoll1;
    }


    public int getInitialRoll2() {
        return initialRoll2;
    }

    public int getInitialRollSum() {
        return initialRollSum;
    }

    public int getNewRoll() {
        return rollDie();
    }

    private int rollDie() {
        int max = 6;
        int min = 1;
        int range = max - min + 1;
        int rand = (int) (Math.random() * range) + min;
        return rand;
    }


}
