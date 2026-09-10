package patterns;

import java.util.Scanner;

public class halfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=1;
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(n1);
                n1++;
            }
            n1 = 1;
            System.out.println();
        }
        char a= 'a';
        System.out.println(a+1);
    }
}
