package com.company;

import java.util.function.Function;

public class Main {

    public static void naRaspon100(Function<Double, Double>  funkcija) {
        for(double i=0;i<=100;i++) {
            System.out.println(funkcija.apply(i));
        }
    }

    public static void main(String[] args) {
        naRaspon100(x -> x*x+2*x+1);
    }
}