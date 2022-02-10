package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.*;
public class LionTest {

    @Test
    public void createLionMaleTest(){
        Feline feline = new Feline();
        try {
            Lion lion = new Lion("Самец",feline);
        }
        catch (Exception exception){
            System.out.println(exception);
        }
    }

    @Test
    public void createLionFemaleTest(){
        Feline feline = new Feline();
        try {
            Lion lion = new Lion("Самка",feline);
        }
        catch (Exception exception){
            System.out.println(exception);
        }
    }

    @Test
    public void createLionTest(){
        Feline feline = new Feline();
        try {
            Lion lion = new Lion("Львёнок",feline);
        }
        catch (Exception exception){
            System.out.println(exception);
        }
    }

    @Test
    public void getKittens() {
        Feline feline = new Feline();
        try {
            Lion lion = new Lion("Самец",feline);
            lion.getKittens();
        }
        catch (Exception exception) {
            System.out.println(exception);
        }

    }

    @Test
    public void doesHaveManeTest() {
        Feline feline = new Feline();
        try {
            Lion lion = new Lion("Самец",feline);
            lion.doesHaveMane();
        }
        catch (Exception exception){
            System.out.println(exception);
        }

    }

    @Test
    public void getFoodTest() {
        Feline feline = new Feline();
        try {
            Lion lion = new Lion("Самец",feline);
            lion.getFood();
        }
        catch (Exception exception){
            System.out.println(exception);
        }
    }
}