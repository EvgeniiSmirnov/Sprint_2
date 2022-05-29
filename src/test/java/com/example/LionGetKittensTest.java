package com.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

public class LionGetKittensTest {

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    private Feline feline;

    @Test
    public void TestGetKittensOneKitten() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int expected = 1;
        Mockito.when(feline.getKittens()).thenReturn(expected);
        assertEquals(expected, lion.getKittens());
    }
}
