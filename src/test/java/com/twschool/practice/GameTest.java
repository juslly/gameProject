package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class GameTest {
    public static void main(String[] args){
        //测试1
//        GameTest gameTest = new GameTest();
//        gameTest.should_return_4A0B_given_four_numbers();

        //测试2
        GameTest gameTest1 = new GameTest();
        gameTest1.should_return_4A0B_given_four_numbers();


    }

//    @Test
    public void should_return_4A0B_given_four_numbers() {
        Answer answer = new Answer();
        Generator generator = new Generator();
        int gameAnswer[] = generator.getRandom();
        for(int i = 0 ;i < 4; i++){
            System.out.print(gameAnswer[i]);
        }
        int userAnswer[] = answer.userInput();
        String consoleResult = answer.getOutputResult(gameAnswer, userAnswer);
        System.out.println(consoleResult);
        Game game = new Game();
        consoleResult = game.isOverOrNot(gameAnswer,consoleResult);
//
//        for(int k = 0 ;k < 6;k++){
//            Game game = new Game();
//            String flag = game.judge(consoleResult);
//            if("0".equals(flag)){
//                int userInputAnswer[] = answer.userInput();
//                consoleResult = answer.getOutputResult(gameAnswer, userInputAnswer);
//            }else if ("1".equals(flag)){
//                break;
//            }
//            if(k == 5){
//                System.out.println("失败！");
//            }
//
//        }
        if(null != consoleResult){
            assertEquals("4A0B", consoleResult);

        }else{
            assertEquals(null, consoleResult);
        }


    }

    public void should_return_0A4B_given_four_numbers() {
        Answer answer = new Answer();
        Generator generator = new Generator();
        int gameAnswer[] = generator.getRandom();
        for(int i = 0 ;i < 4; i++){
            System.out.println(gameAnswer[i]);
        }
        int userAnswer[] = answer.userInput();
        String consoleResult = answer.getOutputResult(gameAnswer, userAnswer);
        assertEquals("0A4B", consoleResult);
    }
}
