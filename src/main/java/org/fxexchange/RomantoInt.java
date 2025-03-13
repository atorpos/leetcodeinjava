package org.fxexchange;

public class RomantoInt {
    public int romanToInt(String s) {
        int integvalue = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentvalue = getValue(s.charAt(i));
            if (i < s.length() - 1 && getValue(s.charAt(i + 1)) > currentvalue) {
                integvalue = integvalue - currentvalue;
            } else {
                integvalue = integvalue + currentvalue;
            }
        }

        return integvalue;
    }

    private int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
