package implementation;

import hackerrank.implementation.easy.ElectronicsShop;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestElectronicsShop {

    @Test
    public void test() {
        int[] keyboards= new int[]{3,1};
        int[] usbs = new int[]{5,2,8};
        assertEquals(9, ElectronicsShop.getMoneySpent(keyboards, usbs, 10));
    }

}
