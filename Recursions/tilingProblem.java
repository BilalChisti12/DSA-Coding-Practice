package Recursions;

import java.util.Scanner;

public class tilingProblem {
    static int twoByN(int n){
        if(n==1 || n ==0){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        return twoByN(n-1)+twoByN(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(twoByN(n));
    }
}
