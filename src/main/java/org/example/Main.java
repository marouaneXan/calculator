package org.example;

import org.example.calculator.Calculator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        String s="12-100+2-89";
        double res=c.calcul(s);
        System.out.println(res);
    }
}
