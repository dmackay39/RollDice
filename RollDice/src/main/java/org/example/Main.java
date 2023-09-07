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

        boolean keepPlaying = true;

        while (keepPlaying) {

            System.out.println("Welcome to Roll the Dice! Press enter to play.");
            String userInput = myScanner.nextLine();
            rollDie.initialRoll();


            System.out.println("Your initial rolls were " + rollDie.getInitialRoll1() + " and " + rollDie.getInitialRoll2() + ", which give you a total of " + (rollDie.getInitialRollSum()));

            System.out.println("Keep rolling! Lets see how many rolls it takes to get a total of " + rollDie.getInitialRollSum() + " again.\n");


            int count = 1;
            boolean correct = false;

            while (!correct) {
                System.out.println("Press enter to roll the dice again.");
                userInput = myScanner.nextLine();
                int roll1 = rollDie.getNewRoll();
                int roll2 = rollDie.getNewRoll();
                int rollSum = roll1 + roll2;
                System.out.println("You rolled " + roll1 + " and " + roll2 + " which give you a total of " + (rollSum));
                if (rollSum == rollDie.getInitialRollSum()) {
                    correct = true;
                } else {
                    count += 1;
                }

            }
            System.out.println("it took " + count + " extra roll(s) of the dice. Well done!");
            System.out.println("Would you like to play again? Enter yes or no.");
            userInput = myScanner.nextLine();
            if (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y")) {

            } else if (userInput.equalsIgnoreCase("no") || userInput.equalsIgnoreCase("n")) {
                keepPlaying = false;
            } else {
                System.out.println("Invalid input. Bye!");
                keepPlaying = false;
            }

        }


    }
}