package implementation;

import algorithms.implementation.easy.SaveThePrisoner;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestSaveThePrisoner {

    @Test
    public void test() {
        assertEquals(2, SaveThePrisoner.saveThePrisoner(5, 2, 1));
        assertEquals(3, SaveThePrisoner.saveThePrisoner(5, 2, 2));

        assertEquals(6, SaveThePrisoner.saveThePrisoner(7, 19, 2));
        assertEquals(3, SaveThePrisoner.saveThePrisoner(3, 7, 3));

        assertEquals(1, SaveThePrisoner.saveThePrisoner(1, 1, 1));
        assertEquals(1, SaveThePrisoner.saveThePrisoner(5, 2, 5));

        assertEquals(6, SaveThePrisoner.saveThePrisoner(6, 10, 3));
    }

}
