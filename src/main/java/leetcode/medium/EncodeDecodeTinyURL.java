package leetcode.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class EncodeDecodeTinyURL {

    private Map<String, String> map = new HashMap<>();

    public String encode(String longUrl) {
        String randomHash = generateRandomHash(6);
        while(map.containsKey(randomHash)) {
            randomHash = generateRandomHash(6);
        }
        map.put(randomHash, longUrl);
        return randomHash;
    }

    private String generateRandomHash(int length) {
        String result = "";
        Random random = new Random();
        for(int i=0; i<length; i++) {
            int r = random.nextInt(36);
            if (r < 10) {
                result += r;
            } else {
                result += (char)(r+96);
            }
        }
        return result;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }

}
