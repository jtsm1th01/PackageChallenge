package com.example.calculations;

import java.util.ArrayList;

/**
 * Created by travis on 4/21/16.
 */
public class Series {

    public static ArrayList nSum(int n) {
        ArrayList series = new ArrayList();
        int sum = 0;
        for(int i=0; i<=n; i++) {
            sum += i;
            series.add(sum);
        } return series;
    }

    public static ArrayList nFactorial(int n) {
        ArrayList series = new ArrayList();
        int product = 1;
        for(int i=1; i<=n; i++) {
            product *= i;
            series.add(product);
        } return series;
    }


    public static ArrayList<Integer> fibonacci(int n) {
        ArrayList<Integer> series = new ArrayList<>();
        series.add(0);
        series.add(1);
        for(int i=2; i<=n; i++) {
            series.add((series.get(i-2))+(series.get(i-1)));
        } return series;
    }



}
