package com.random;

import java.util.Random; // For Math.random();
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumGenerator {
    public static void main(String[] args) {

        int num = ThreadLocalRandom.current().nextInt(0, 100);
        IO.println(num);
         // IO.println(Math.random()); - For Random double numbers starts at 0 and 1 and in between is the total.
    }
}
