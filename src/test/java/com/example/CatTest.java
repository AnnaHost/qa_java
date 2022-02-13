package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Cat cat;

    @Test
    public void getSoundTest() {
        cat.getSound();
        String actual = Mockito.verify(cat, Mockito.times(1)).getSound();
    }

    @Test
    public void getFoodTest() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        try {
            cat.getFood();
            String expected = "[Животные, Птицы, Рыба]";
            String actual = cat.getFood().toString();
            Assert.assertEquals(expected,actual);
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}