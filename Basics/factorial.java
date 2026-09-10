package basics;

import java.util.Scanner;

public class factorial {
    static int fact(int n){
        int fact=1;
        while(n != 1){
            fact *= n;
            n--;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}
