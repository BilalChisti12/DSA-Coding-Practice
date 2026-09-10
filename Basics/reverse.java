package basics;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1;
        int fin =0;
        int digits= (int)Math.log(10) +1;
        while(n!=0){
            n1 = n %10;
            fin = fin + (n1 * (int)Math.pow(10,digits-1));
            n /= 10;
            digits--;
        }
        System.out.print(fin);
    }
}
