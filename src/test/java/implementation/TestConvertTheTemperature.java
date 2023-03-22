package implementation;

import leetcode.easy.ConvertTheTemparature;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestConvertTheTemperature {


    @Test
    public void convert0Celsius() {
        double[] temperatures = ConvertTheTemparature.convertTemperature(0);
        double[] expected = new double[]{273.15, 32};
        Assertions.assertEquals(expected[0], temperatures[0]);
        Assertions.assertEquals(expected[1], temperatures[1]);
    }


    @Test
    public void convert1Celsius() {
        double[] temperatures = ConvertTheTemparature.convertTemperature(1);
        double[] expected = new double[]{274.15, 33.8};
        Assertions.assertEquals(expected[0], temperatures[0]);
        Assertions.assertEquals(expected[1], temperatures[1]);
    }

    @Test
    public void convert36Celsius() {
        double[] temperatures = ConvertTheTemparature.convertTemperature(36.5);
        double[] expected = new double[]{309.65, 97.7};
        Assertions.assertEquals(expected[0], temperatures[0]);
        Assertions.assertEquals(expected[1], temperatures[1]);
    }

}
