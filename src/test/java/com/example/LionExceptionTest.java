package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionExceptionTest {

    @Mock
    private Feline feline;

    @Test
    public void exceptionMessageErrorTest() {
        try {
            Lion lion = new Lion(" ", feline);
        } catch (Exception thrown) {
            String expected = "Используйте допустимые значения пола животного - самец или самка";
            assertEquals(expected, thrown.getMessage());
        }
    }
}