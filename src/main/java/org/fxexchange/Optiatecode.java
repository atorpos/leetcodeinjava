package org.fxexchange;

public class Optiatecode {

    public static int minRequestFlips(String requestSeq) {
        int countOnes = 0;
        int countZeros = 0;

        for (char c : requestSeq.toCharArray()) {
            if (c == '1') {
                countOnes++;
            } else if (c == '0') {
                countZeros++;
            }
        }

        return Math.min(countOnes, countZeros);

    }
}
