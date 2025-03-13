package org.fxexchange;

import java.util.List;

public class Fizzbuzz {
    public List<String> getarray(int n) {
        String[] numbers = new String[n];
        for (int i = 0; i < n; i++) {
            int j = i +1;
            if( j % 3 == 0 && j % 5 == 0) {
                numbers[i] = "FizzBuzz";
            } else if ( j % 3 == 0 ) {
                numbers[i] = "Fizz";
            } else if ( j % 5 == 0 ) {
                numbers[i] = "Buzz";
            } else {
                numbers[i] = String.valueOf(j);
            }
        }
        return List.of(numbers);
    }
}
