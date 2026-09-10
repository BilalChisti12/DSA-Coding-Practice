package Recursions;

import java.util.ArrayList;
import java.util.Scanner;

public class binStringsProblem {
    static void binString(int n, int lp, String str){
        if(n == 0){
            System.out.println(str);
            return;
        }
        binString(n-1, 0, str+"0");
        if(lp == 0){
            binString(n-1, 1, str+"1");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        binString(n, 0, "");
    }
}
