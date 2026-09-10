package Recursions;

import java.util.Scanner;

public class decOrder {
    static void printDec(int n){
        if(n == 0){
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDec(n);
    }
}
