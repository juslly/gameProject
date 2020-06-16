package com.twschool.practice;

import java.util.Random;

public class Generator {
    public int[] getRandom() {
        int[] gameAnswer = new int[4];
        Random random = new Random();
        for (int i = 0; i < 4; i++) {

            gameAnswer[i] = random.nextInt(10);

        }
        return gameAnswer;
    }
}
