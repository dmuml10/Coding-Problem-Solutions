package implementation;

import algorithms.implementation.SumIntegerDigits;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSumIntegerDigits {

    @Test
    public void test1() {
        String a = "111";
        String b = "2";
        String x = "01203";
        assertEquals(3, SumIntegerDigits.sumIntegerDigits(a));
        assertEquals(2, SumIntegerDigits.sumIntegerDigits(b));
        assertEquals(6, SumIntegerDigits.sumIntegerDigits(x));
    }

}
