package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineParamTest {

    private final Feline feline = new Feline();
    private final int kittensCount;
    private final int expected;

    public FelineParamTest(int kittensCount, int expected) {
        this.kittensCount = kittensCount;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getNumberOfKittens() {
        return new Object[][]{
                {0, 0},
                {3, 3},
                {7, 7},
        };
    }

    @Test
    public void testGetKittensWithArgument() {
        int actual = feline.getKittens(kittensCount);
        Assert.assertEquals(expected, actual);
    }
}