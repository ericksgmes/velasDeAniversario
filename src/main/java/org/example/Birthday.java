package org.example;

import java.util.ArrayList;

public class Birthday {
    private int age;
    private ArrayList<Integer> candles = new ArrayList<>();
    public Birthday(int age) {
        this.age = age;
    }

    public void addCandle(int candle) {
        candles.add(candle);
    }

    public int blowCandles() {
        return 0;
    }
}
