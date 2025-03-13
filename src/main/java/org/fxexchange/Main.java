package org.fxexchange;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Fizzbuzz fizzbuzz = new Fizzbuzz();
        System.out.println(fizzbuzz.getarray(5));
        RomantoInt romanToInt = new RomantoInt();
        System.out.println(romanToInt.romanToInt("MCMXCIV"));
        Stocktiming stocktiming = new Stocktiming();
        System.out.println(stocktiming.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}