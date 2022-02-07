package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineTest {

    private final int kittensCount;


    public FelineTest(int kittensCount){
        this.kittensCount = kittensCount;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensCount() {
        return new Object[][] {
                {1},{2},{0},{50000}
        };
    }

    @Test
    public void getKittens() {
        Feline feline = new Feline();
        feline.getKittens(kittensCount);
    }

    @Test
    public void eatMeat() {
        try {
            Feline feline = new Feline();
            feline.eatMeat();
        }
        catch (Exception exception){
            System.out.println("Ошибка в методе eatMeat");
        }
    }

    @Test
    public void getFamily() {
        try {
            Feline feline = new Feline();
            feline.getFamily();
        }
        catch (Exception exception){
            System.out.println("Ошибка в методе getFamily");
        }
    }
}