package Recursions;

import java.util.Scanner;

public class sumOfN {
    static int sumOfnums(int n){
        if(n == 1) {
            return 1;
        }
        return n+sumOfnums(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOfnums(n));
    }
}
