package org.example.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {


    public char[] arrayOfOperator(String s){
        List<Character> c=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='+' || ch=='-') {
                c.add(ch);
            }
        }
        char[] opArr=new char[c.size()];
        for(int i=0;i<opArr.length;i++){
            opArr[i]=c.get(i);
        }
        return opArr;
    }

    public String[] arrayOfNumbers(String s){
        String regex = "[+-]";
        String[] arrOfNum = s.split(regex);
        return arrOfNum;
    }

    public double calcul(String s){
        String[] numbers=arrayOfNumbers(s);
        char[] operators=arrayOfOperator(s);
        double res=toNumber(numbers[0]);

        for(int i=0;i<operators.length;i++){
            if(operators[i]=='+') res+=toNumber(numbers[i+1]);
            else if(operators[i]=='-') res-=toNumber(numbers[i+1]);
        }

        return res;
    }

    public double toNumber(String s){
        return Double.parseDouble(s);
    }
}
