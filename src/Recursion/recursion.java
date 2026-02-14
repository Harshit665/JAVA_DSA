package Recursion;

import java.util.Scanner;

public class recursion {
    static int count = 0;
    static void number(){
        if (count == 3){
            return;
        }
        else {
            System.out.println(count);
            count++;
            number();
        }
    }

    static void name(int i,int n,String value){
        if (i > n){
            return;
        }
        else {
            System.out.println(value);
            name(i+1,n,value);
        }
    }

    static void value(int i,int n){
        if (i>n){
            return;
        }
        else {
            System.out.println(i);
            value(i+1,n);
        }
    }

    static void reverse(int n){
        if (n<1){
            return;
        }
        else {
            System.out.println(n);
            reverse(n-1);
        }
    }

    public static void main(String[] args) {
//        number();
//        name(1,4,"harshit kesharwabi");
//        value(1,10);
        reverse(6);
    }
}
