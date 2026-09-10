package basics;

import java.util.Scanner;

public class reverse1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int n1;
        while (n != 0) {
            n1 = n %10;
            rev = rev*10 + n1;
            n /= 10;
        }
        System.out.println(rev);
    }
}
