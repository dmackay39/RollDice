package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        RollDie rollDie = new RollDie();
        System.out.println("Press enter to roll the die");
        String start = myScanner.nextLine();
        rollDie.initialRoll();
        System.out.println("Your initial roll is " + rollDie.getInitialRoll());


        int count = 1;
        boolean correct = false;

        while (!correct){
            System.out.println("Press enter to roll the die again");
            start = myScanner.nextLine();
            int roll = rollDie.getNewRoll();
            System.out.println("Your current roll is " + roll);
            if (roll == rollDie.getInitialRoll()){
                correct = true;
            } else {
                count += 1;
            }
        }
        System.out.println("it took " + count + " rolls of the die");
    }
}