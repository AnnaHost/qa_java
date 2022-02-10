package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Cat cat;


    @Test
    public void getSoundTest() {
        cat.getSound();
        Mockito.verify(cat, Mockito.times(1)).getSound();
    }

    @Test
    public void getFoodTest() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        try {
            cat.getFood();
        }
        catch (Exception exception) {
            System.out.println("Ошибка в методе getFoodTest");
        }
    }
}