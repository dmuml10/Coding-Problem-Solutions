package algorithms.implementation.easy;

import java.util.HashSet;
import java.util.Set;

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        Set<Integer> socks = new HashSet<>();
        int count = 0;
        for (int i=0; i<ar.length; i++) {
            if (socks.contains(ar[i])) {
                count++;
                socks.remove(ar[i]);
            } else {
                socks.add(ar[i]);
            }
        }
        return count;
    }

}
