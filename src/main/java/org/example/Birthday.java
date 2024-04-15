package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

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
        if(candles.isEmpty() || candles.size() != this.age){
            return 0;
        }
        int blowedCandles = 0;
        Collections.sort(candles);
        for (int i = 0; i < age; i++) {
            if (Objects.equals(candles.get(i), candles.getLast())) {
                blowedCandles++;
            }
        }
        return blowedCandles;
    }
}
