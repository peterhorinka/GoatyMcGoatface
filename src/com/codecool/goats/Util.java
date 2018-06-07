package com.codecool.goats;

import java.util.Random;

public class Util {
    static Random random = new Random();

    static int randomBetween(int min, int max){
        return random.nextInt(max-min)+min;
    }
}
