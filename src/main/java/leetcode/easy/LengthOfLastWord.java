package leetcode.easy;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        s = s.trim();
        var result = s.split(" ");
        return result[result.length-1].length();
    }

}
