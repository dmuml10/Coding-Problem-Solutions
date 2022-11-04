package hackerrank.implementation.medium;

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
                        int index = G[i].substring(startIndex).indexOf(P[0]);
                        if (index == -1) {
                          break;
                        } else {
                          startIndex += index;
                        }
                      System.out.println(startIndex);
                    } else {
                        break;
                    }
                }

            }
        }
        return "NO";
    }

}
