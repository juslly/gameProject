package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class GameTest {
    public static void main(String[] args){
        GameTest gameTest = new GameTest();
        gameTest.should_return_4A0B_given_four_numbers();

    }

//    @Test
    public void should_return_4A0B_given_four_numbers() {
        Answer answer = new Answer();
        Generator generator = new Generator();
        int gameAnswer[] = generator.getRandom();
        for(int i = 0 ;i < 4; i++){
            System.out.println(gameAnswer[i]);
        }
        int userAnswer[] = answer.userInput();
       // int userAnswer[] = {2, 6, 7, 2};
        for(int i = 0 ;i < 4; i++){
            System.out.println(userAnswer[i]);
        }
        String consoleResult = answer.getOutputResult(gameAnswer, userAnswer);
        assertEquals("4A0B", consoleResult);
    }
}
