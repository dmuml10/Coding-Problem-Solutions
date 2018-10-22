import algorithms.implementation.BirthdayChocolate;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestBirthdayChocolate {

    @Test
    public void test1() {
        List<Integer> list = Arrays.asList(1,2,1,3,2);

        assertEquals(2, BirthdayChocolate.birthday(list, 3, 2));
    }

    @Test
    public void test2() {
        List<Integer> list = Arrays.asList(4);

        assertEquals(1, BirthdayChocolate.birthday(list, 4, 1));
    }

}
