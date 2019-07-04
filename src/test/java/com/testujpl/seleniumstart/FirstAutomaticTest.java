package com.testujpl.seleniumstart;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstAutomaticTest {

    @Test
    public void testAdditionResult() {
        //given
        int firstNumber = 15;
        int secondNumber = 24;
        int expected = 39;

        //when
        int actualResult = addTwoNumbers(firstNumber, secondNumber);

        //then
        assertEquals(expected, actualResult);

    }

    public int addTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}