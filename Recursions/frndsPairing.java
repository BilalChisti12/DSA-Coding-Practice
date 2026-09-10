package Recursions;

import java.util.Scanner;

public class frndsPairing {
    static int frndPair(int n){
        if(n == 1 || n == 2) return n;
        return frndPair(n-1) + (n-1)*frndPair(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(frndPair(n));
    }
}
