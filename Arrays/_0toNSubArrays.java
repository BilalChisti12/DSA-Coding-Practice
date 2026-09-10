package Arrays;

import java.util.Scanner;

public class _0toNSubArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i; j<n; j++){
                for(int k = i; k<=j; k++){
                    System.out.print(k+" ");
                }
                System.out.println();
            }

        }
    }
}
