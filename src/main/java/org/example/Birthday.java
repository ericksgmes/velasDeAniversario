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
        int blowedCandles = 0;
        for (int i = 0; i < age; i++) {
            blowedCandles++;
        }
        return blowedCandles;
    }
}
