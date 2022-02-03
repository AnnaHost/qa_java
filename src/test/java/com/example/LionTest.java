package com.example;

import static org.junit.Assert.*;

public class LionTest {

    @org.junit.Test
    public void getKittens() {
        Feline feline = new Feline();
        try {
            Lion lion = new Lion("Male",feline);
        }
        catch (Exception exception) {

        }

    }

    @org.junit.Test
    public void doesHaveMane() {
    }

    @org.junit.Test
    public void getFood() {
    }
}