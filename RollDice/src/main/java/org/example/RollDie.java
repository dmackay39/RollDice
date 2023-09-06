package org.example;

public class RollDie {
    private int initialRoll;

    public void initialRoll() {
        initialRoll = rollDie();
    }

    public int getInitialRoll() {
    return initialRoll;
    }

    

    private int rollDie() {

        int max = 6;
        int min = 1;
        int range = max - min + 1;
        int rand = 0;

        // generate random numbers within 1 to 6
        for (int i = 0; i < 6; i++) {
            rand = (int) (Math.random() * range) + min;

            // Output is different everytime this code is executed

        }
        return rand;

    }


}
