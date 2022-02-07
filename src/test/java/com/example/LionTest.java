package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;
public class LionTest {

    @Test
    public void createLionMale(){
        Feline feline = new Feline();
        try {
            Lion lion = new Lion("Самец",feline);
        }
        catch (Exception exception){
            System.out.println("Ошибка в методе createLionMale");
        }
    }

    @Test
    public void createLionFemale(){
        Feline feline = new Feline();
        try {
            Lion lion = new Lion("Самка",feline);
        }
        catch (Exception exception){
            System.out.println("Ошибка в методе createLionFemale");
        }
    }

    @Test
    public void createLion(){
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
    public void doesHaveMane() {
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
    public void getFood() {
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