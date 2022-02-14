package com.example;

import org.junit.Assert;
import org.junit.Test;

public class LionTest {

    @Test
    public void createLionMaleTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        Assert.assertNotNull(lion);
    }

    @Test
    public void createLionFemaleTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самка", feline);
        Assert.assertNotNull(lion);
    }

    @Test
    public void getKittens() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        int expected = 1;
        int actual = lion.getKittens();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        boolean expected = true;
        boolean actual = lion.doesHaveMane();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getFoodTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        String expected = "[Животные, Птицы, Рыба]";
        String actual = lion.getFood().toString();
        Assert.assertEquals(expected, actual);
    }
}