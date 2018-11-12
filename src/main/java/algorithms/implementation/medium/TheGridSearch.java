package algorithms.implementation.medium;

public class TheGridSearch {

    static String gridSearch(String[] G, String[] P) {
        for (int i=0; i<G.length; i++) {
            if (G[i].contains(P[0]) && P.length <= G.length - i) {
                int startIndex = G[i].indexOf(P[0]);
                while(startIndex >= 0) {
                    int newIndex = i;
                    int count = 1;
                    for (int j=1; j<P.length; j++) {
                        newIndex++;
                        if (!G[newIndex].substring(startIndex, startIndex + P[0].length()).contains(P[j])) {
                            break;
                        } else {
                            count++;
                            if (count == P.length) {
                                return "YES";
                            }
                        }

                    }
                    if (startIndex + 1 < G[i].length()) {
                        startIndex += 1;
                        startIndex = G[i].substring(startIndex).indexOf(P[0]);

                    } else {
                        break;
                    }
                }

            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        String[] a = new String[]{"123412",
        "561212",
        "123634",
        "781288"};
        String[] b = new String[] {"12","34"};
        System.out.println(gridSearch(a,b));
    }

}
