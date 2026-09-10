package Recursions;

import java.util.Scanner;

public class xPown {
    static int expo(int x, int n){
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return x;
        }
        return x * expo(x,n-1);
    }

    static int optXPowN(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfPow = optXPowN(x, n/2);
        if(n%2 == 0){
            return halfPow*halfPow;
        }
        return x * halfPow * halfPow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int n = sc.nextInt();
        System.out.println(optXPowN(2,3));
        System.out.println(~12);
    }
}
