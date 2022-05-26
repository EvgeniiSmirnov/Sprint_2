package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionExceptionTest {

    @Mock
    private Feline feline;

    @Test(expected = AssertionError.class)
    public void exceptionMessageErrorTest() throws AssertionError {
        try {
            Lion lion = new Lion(" ", feline);
            Assert.fail("Expected AssertionError");
        } catch (Exception thrown) {
            Assert.assertNotEquals("Используйте допустимые значения пола животного - самец или самка", thrown.getMessage());
        }
    }
}