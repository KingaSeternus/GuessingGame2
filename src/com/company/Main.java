package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rand_int1 = random.nextInt(1000);


        boolean wasNumberGuessed = false;

        while (!wasNumberGuessed) {
            System.out.println("Give number");
            int rand_int2 = scanner.nextInt();

            if (rand_int1 < rand_int2) {
                System.out.println("Not correct");
            } else if (rand_int1 > rand_int2) {
                System.out.println("Not correct");
            } else {
                System.out.println("Correct!");
                wasNumberGuessed = true;
            }
        }
    }
}
