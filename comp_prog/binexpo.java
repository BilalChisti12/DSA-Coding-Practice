package comp_prog;

import java.util.Scanner;

public class binexpo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();
        double  n=sc.nextInt();
        double sq = Math.pow(a*a, n/2);
        System.out.println(sq);
    }
}
