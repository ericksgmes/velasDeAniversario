package org.example;

public class Main {
    public static void main(String[] args) {
        Birthday birthday = new Birthday(5);
        int candlesBlowed;
        birthday.addCandle(2);
        birthday.addCandle(5);
        birthday.addCandle(6);
        birthday.addCandle(6);
        birthday.addCandle(3);
        candlesBlowed =  birthday.blowCandles();
        System.out.println("For her " + birthday.getAge() + "th birthday, she got to blow " + candlesBlowed + " candles!!");
    }
}