package com.example;

import org.junit.Assert;
import org.junit.Test;

public class LionTest {

    @Test
    public void createLionMaleTest() {
        Feline feline = new Feline();
        try {
            Lion lion = new Lion("Самец", feline);
            Assert.assertNotNull(lion);
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }

    @Test
    public void createLionFemaleTest() {
        Feline feline = new Feline();
        try {
            Lion lion = new Lion("Самка", feline);
            Assert.assertNotNull(lion);
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }

    @Test
    public void createLionTest() {
        Feline feline = new Feline();
        try {
            Lion lion = new Lion("Львёнок", feline);
            Assert.assertNull(lion);
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }

    @Test
    public void getKittens() {
        Feline feline = new Feline();
        try {
            Lion lion = new Lion("Самец", feline);
            int expected = 1;
            int actual = lion.getKittens();
            Assert.assertEquals(expected, actual);
        } catch (Exception exception) {
            System.out.println(exception);
        }

    }

    @Test
    public void doesHaveManeTest() {
        Feline feline = new Feline();
        try {
            Lion lion = new Lion("Самец", feline);
            boolean expected = true;
            boolean actual = lion.doesHaveMane();
            Assert.assertEquals(expected, actual);
        } catch (Exception exception) {
            System.out.println(exception);
        }

    }

    @Test
    public void getFoodTest() {
        Feline feline = new Feline();
        try {
            Lion lion = new Lion("Самец", feline);
            String expected = "[Животные, Птицы, Рыба]";
            String actual = lion.getFood().toString();
            Assert.assertEquals(expected,actual);
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}