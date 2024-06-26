
import org.example.Birthday;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class BirthdayTest {
    private Birthday birthday;
    @BeforeEach
    void setUp(){
        birthday = new Birthday(4);
    }

    @Test
    @DisplayName("Should blow out every candle")
    void shouldBlowOutEveryCandle(){
        birthday.addCandle(2);
        birthday.addCandle(2);
        birthday.addCandle(2);
        birthday.addCandle(2);
        assertThat(birthday.blowCandles()).isEqualTo(4);
    }

    @Test
    @DisplayName("Should Blow Only The Highest Candles")
    void shouldBlowOnlyTheHighestCandles(){
        birthday.addCandle(4);
        birthday.addCandle(4);
        birthday.addCandle(1);
        birthday.addCandle(2);
        assertThat(birthday.blowCandles()).isEqualTo(2);

    }

    @Test
    @DisplayName("Should only add age number of candles")
    void shouldOnlyAddAgeNumberOfCandles() {
        Birthday birthday = new Birthday(2);
        birthday.addCandle(12);
        birthday.addCandle(4);
        int returnedVal = birthday.addCandle(2);
        assertThat(returnedVal).isEqualTo(0);
    }
}
