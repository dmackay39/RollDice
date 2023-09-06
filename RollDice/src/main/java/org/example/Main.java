package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        RollDie RollDie = new RollDie();
        System.out.println("Press enter to roll the die");
        String start = myScanner.nextLine();



        if (start.equals(""))
        {

            RollDie.initialRoll();
            System.out.println("");

        }


    }
}