package hackerrank.warmup;

public class TimeConversion {
    static String timeConversion(String s) {
        String result = "";

        int h = Integer.parseInt(s.substring(0,2));
        if (s.endsWith("PM")) {
            if (!s.startsWith("12")) {
                h += 12;
            }
        } else if (s.startsWith("12")){
            h = 0;
        }

        result += h + s.substring(2, s.length() - 2);
        if (result.length() < 8) {
            result = "0" + result;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(timeConversion("07:05:45PM"));
        System.out.println(timeConversion("07:05:45AM"));
        System.out.println(timeConversion("12:12:00PM"));
        System.out.println(timeConversion("12:00:00AM"));
    }
}
