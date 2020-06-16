package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    @Test
    public void should_return_4A0B_given_four_numbers() {
        Answer answer = new Answer();
        int gameAnswer[] = {1, 3, 5, 7};
        int userAnswer[] = {1, 3, 5, 7};
        String consoleResult = answer.getOutputResult(gameAnswer,userAnswer);
        assertEquals("4A0B",consoleResult);
    }
}
