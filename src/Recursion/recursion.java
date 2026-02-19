package Recursion;

import java.util.Scanner;

public class recursion {
    static int count = 0;
    static int sum = 0;
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

    static void sumOfNumbers(int i,int n){
        if (i>n){
            return;
        }
        else {
            sum = sum + i;
            sumOfNumbers(i+1,n);
        }
    }

    static int fact(int n){
        if (n==0 || n==1){
            return 1;
        }
        int ans = n*fact(n-1);
        return ans;
    }

    static int pow(int a, int b){
        if (b==0){
            return 1;
        }
        else {
            int ans = a * pow(a,b-1);
            return ans;
        }
    }

    static int reverse(int n,int rev){
        if (n==0){
            return rev;
        }
        else {
            int ld = n % 10;
            int ans = reverse(n/10,rev*10+ld);
            return ans;
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static void reverseArray(int[] arr, int l, int r) {
        if (l >= r) return;

        swap(arr, l, r);
        reverseArray(arr, l + 1, r - 1);
    }


    public static void main(String[] args) {
//        number();
//        name(1,4,"harshit kesharwabi");
//        value(1,10);
//        reverse(6);
//        sumOfNumbers(1,4);
//        System.out.println(sum);
//        System.out.println(fact(3));
//        System.out.println(pow(3,3));
//        System.out.println(reverse(1234,0));

        // reversing an array using the recursion
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the lenght of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the" + n + "elements of array");
        for (int i =0 ;i<n;i++){
            arr[i] = sc.nextInt();
        }
        reverseArray(arr,0,n-1);
        for (int j=0;j<n;j++){
            System.out.println(arr[j]);
        }
    }
}
