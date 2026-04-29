package leetcode.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistinctPrimeFactors {

    public int distinctPrimeFactors(int[] nums) {
        List<Integer> primes = new ArrayList<>();
        for (int i=2; i<=1000; i++) {
            boolean isPrime = true;
            for (int j=2; j<Math.sqrt(i)+1; j++) {
                if (i!=j && i%j==0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                primes.add(i);
            }
        }

        Set<Integer> distinctFactors = new HashSet<>();
        for (int num : nums) {
            if (primes.contains(num)) {
                distinctFactors.add(num);
            } else {
                for (int i=0; i<primes.size(); i++) {
                    if (num%primes.get(i) == 0) {
                        distinctFactors.add(primes.get(i));
                    }
                    if (primes.get(i) > num/2+1) {
                        break;
                    }
                }
            }
        }
        return distinctFactors.size();
    }

}
