package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineTest {

    private final int kittensCount;

    public FelineTest(int kittensCount) {
        this.kittensCount = kittensCount;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensCount() {
        return new Object[][]{
                {1}, {2}, {0}, {50000}
        };
    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens(kittensCount);
        Assert.assertEquals(kittensCount, actual);

    }

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        String expected = "[Животные, Птицы, Рыба]";
        String actual = feline.eatMeat().toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        Assert.assertEquals(expected, actual);
    }
}