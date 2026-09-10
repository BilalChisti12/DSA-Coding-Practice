package Recursions;

import java.util.Scanner;

public class nthFibNum {
    static int fibNum(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 1;
        }
        return fibNum(n-1)+fibNum(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibNum(n));
    }
}
