package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Birthday {
    private final int age;
    private final ArrayList<Integer> candles = new ArrayList<>();

    public Birthday(int age) {
        this.age = age;
    }

    public int addCandle(int candle) {
        if (candles.size() >= age) {
            return 0;
        }
        candles.add(candle);
        Collections.sort(candles);
        return 1;
    }

    public int blowCandles() {
        if(candles.isEmpty() || candles.size() != this.age) return 0;
        int blowedCandles = 0;
        for (int candle: candles) {
            if (isCandleMaxHeight(candle)) {
                blowedCandles++;
            }
        }
        return blowedCandles;
    }

    private boolean isCandleMaxHeight(int candle) {
        return Objects.equals(candle, candles.getLast());
    }
}
