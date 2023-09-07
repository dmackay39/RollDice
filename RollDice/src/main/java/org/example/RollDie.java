package org.example;

public class RollDie {
    private int initialRoll;

    public void initialRoll() {
        initialRoll = rollDie();
    }

    public int getInitialRoll() {
        return initialRoll;
    }

    public int getNewRoll(){
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
