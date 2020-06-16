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
        for(int i = 0 ;i < 4; i++){
            System.out.println(userAnswer[i]);
        }
        String consoleResult = answer.getOutputResult(gameAnswer, userAnswer);
        if(!"4A0B".equals(consoleResult)){
            Answer userInputAnswer = new Answer();
            int[] userInput = userInputAnswer.userInput();
            consoleResult = answer.getOutputResult(gameAnswer, userInput);
        }else{
            System.out.println("恭喜你猜对了");
        }


        assertEquals("4A0B", consoleResult);
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
