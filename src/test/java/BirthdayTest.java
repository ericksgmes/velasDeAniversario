
import org.example.Birthday;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class BirthdayTest {
    @Test
    @DisplayName("test")
    void test(){
        System.out.printf("fail");
    }
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
}
