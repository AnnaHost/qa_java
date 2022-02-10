package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;
public class LionTest {

    @Test
    public void createLionMaleTest(){
        Feline feline = new Feline();
        try {
            Lion lion = new Lion("Самец",feline);
        }
        catch (Exception exception){
            System.out.println("Ошибка в методе createLionMale");
        }
    }

    @Test
    public void createLionFemaleTest(){
        Feline feline = new Feline();
        try {
            Lion lion = new Lion("Самка",feline);
        }
        catch (Exception exception){
            System.out.println("Ошибка в методе createLionFemale");
        }
    }

    @Test
    public void createLionTest(){
        Feline feline = new Feline();
        try {
            Lion lion = new Lion("Львёнок",feline);
        }
        catch (Exception exception){
            System.out.println("Ошибка в методе createLion");
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
            System.out.println("Ошибка в методе getKittens");
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
            System.out.println("Ошибка в методе doesHaveMane");
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
            System.out.println("Ошибка в методе getFood");
        }
    }
}