package com.twschool.practice;

import java.util.Scanner;

public class Answer {
    public String getOutputResult(int[] gameAnswer, int[] userAnswer) {
        int amountOfNumAndPosIsEqual = countA(gameAnswer, userAnswer);
        int amountOfNumIsTrueAndPosIsFalse = countB(gameAnswer, userAnswer);
        String result = amountOfNumAndPosIsEqual + "A" + (amountOfNumIsTrueAndPosIsFalse-amountOfNumAndPosIsEqual) + "B";
        return result;
    }


    private int countA(int[] gameAnswer, int[] userAnswer) {
        int amountOfNumAndPosIsEqual = 0;
        for (int i = 0; i < gameAnswer.length; i++) {
            if (gameAnswer[i] == userAnswer[i]) {
                amountOfNumAndPosIsEqual++;
            }
        }
        return amountOfNumAndPosIsEqual;
    }

    private int countB(int[] gameAnswer, int[] userAnswer) {
        int amountOfNumIsTrueAndPosIsFalse = 0;
        for (int i = 0; i < userAnswer.length; i++){
            for (int j = 0; j < gameAnswer.length; j++){
                if(userAnswer[i] == gameAnswer[j]){
                    amountOfNumIsTrueAndPosIsFalse++;
                    break;

                }

            }

        }
        return amountOfNumIsTrueAndPosIsFalse;
    }

    public int[] userInput() {
        int[] userAnswer = new int[4];
        Scanner input=new Scanner(System.in);
        String str = input.next();
        for (int i = 0; i < 4; i++) {
            //userAnswer[i] = input.nextInt();
            userAnswer[i] =Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        return userAnswer;
    }
}
