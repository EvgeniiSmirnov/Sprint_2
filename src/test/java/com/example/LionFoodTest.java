package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionFoodTest {
    @Mock
    private Feline feline;

    @Test
    public void getFoodLionTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        List<String> expectedLionFood = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(lion.getFood()).thenReturn(expectedLionFood);
        assertEquals(expectedLionFood, lion.getFood());
    }
}