package com.twschool.practice;

public class Game {
    public String judge(String consoleResult) {
        if ("4A0B".equals(consoleResult)) {
            System.out.println("恭喜你猜对了");
            return "1";

        } else {
            return "0";
        }
    }


    public String isOverOrNot(int[] gameAnswer, String consoleResult) {
        for (int k = 0; k < 5; k++) {
            Game game = new Game();
            Answer answer = new Answer();
            String flag = game.judge(consoleResult);
            if ("0".equals(flag)) {
                int userInputAnswer[] = answer.userInput();
                consoleResult = answer.getOutputResult(gameAnswer, userInputAnswer);
                System.out.println(consoleResult);
            } else if ("1".equals(flag)) {
                break;
            }
            if ("0".equals(flag) && k == 4) {
                System.out.println("失败！");
                return null;
            }

        }
        return consoleResult;

    }
//        String result = consoleResult;
//        if (!"4A0B".equals(result)) {
//            Answer userInputAnswer = new Answer();
//            Answer answer = new Answer();
//            int[] userInput = userInputAnswer.userInput();
//            result = answer.getOutputResult(gameAnswer, userInput);
//            judge(gameAnswer,result);
//        } else {
//            System.out.println("恭喜你猜对了");
//        }
//        return result;
//    }
}
