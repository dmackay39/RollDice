package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        RollDie rollDie = new RollDie();
        System.out.println(" /\\' .\\    _____\n" +
                "/: \\___\\  / .  /\\\n" +
                "\\' / . / /____/..\\\n" +
                " \\/___/  \\'  '\\  /\n" +
                "          \\'__'\\/");
        System.out.println("Welcome to Roll the Die! Press enter to play.");
        String start = myScanner.nextLine();
        rollDie.initialRoll();
        System.out.println("Your initial roll is " + rollDie.getInitialRoll() + "\n");

        System.out.println("Keep rolling! Lets see how many rolls it takes to get " + rollDie.getInitialRoll() + " again.");


        int count = 1;
        boolean correct = false;
        while (!correct){
            System.out.println("Press enter to roll the die again");
            start = myScanner.nextLine();
            int roll = rollDie.getNewRoll();
            System.out.println("You rolled " + roll);
            if (roll == rollDie.getInitialRoll()){
                correct = true;
            } else {
                count += 1;
            }
        }
        System.out.println("it took " + count + " extra roll(s) of the die. Well done!");
    }
}