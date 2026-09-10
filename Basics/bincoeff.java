package basics;

import java.util.Scanner;
public class bincoeff {
    static int fact(int n)
    {
        if (n == 0)
            return 1;
        return n * fact(n - 1);
    }
    public static int binomial(int n, int r){

        if(r==1){
            return n;
        }
        else if(r == 0){
            return 1;
        }
        else{
            return fact(n)/(fact(r)*(fact(n-r)));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(binomial(n,r));
    }
}
