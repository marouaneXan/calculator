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

    public boolean isOperator(String s){
        String o="+-*/";
        String[] arrOp=o.split("");
        for(String str:arrOp){
           if(str.equals(s)) return true;
        }return false;
    }

    public boolean isNumber(String s){
        if(Integer.parseInt(s)>0 || Integer.parseInt(s)<9) return true;
        return false;
    }

    public double toNumber(String s){
        return Integer.parseInt(s);
    }
}
