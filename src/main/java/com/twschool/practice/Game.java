package com.twschool.practice;

public class Game {
    public String judge(int[] gameAnswer, String consoleResult) {
        String result = consoleResult;
        if (!"4A0B".equals(consoleResult)) {
            Answer userInputAnswer = new Answer();
            Answer answer = new Answer();
            int[] userInput = userInputAnswer.userInput();
            result = answer.getOutputResult(gameAnswer, userInput);
        } else {
            System.out.println("恭喜你猜对了");
        }
        return result;
    }
}
