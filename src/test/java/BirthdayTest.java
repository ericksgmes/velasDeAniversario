
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

    @Test
    @DisplayName("Should blow out every candle")
    void shouldBlowOutEveryCandle(){
        Birthday birthday = new Birthday(3);
        birthday.addCandle(2);
        birthday.addCandle(2);
        birthday.addCandle(2);
        assertThat(birthday.blowCandles()).isEqualTo(3);
    }
}
