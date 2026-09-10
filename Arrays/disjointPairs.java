package Arrays;

import java.util.Scanner;

public class disjointPairs {
    public static void main(String[] args) {
        int pairs=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean[] flag = new boolean[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of num: ");
        int t = sc.nextInt();
            int x=0;
            int y=1;
            while(x<n){
                if(flag[x]){
                    x++;
                    y=x+1;
                    continue;
                }
                if(y>=n){
                    x++;
                    y=x+1;
                    continue;
                }
                if(flag[y]){
                    y++;
                    continue;
                }
                if((arr[x]+arr[y])%t == 0) {
                    flag[x] = true;
                    flag[y] = true;
                    pairs++;
                    x++;
                    y=x+1;
                }
                else{
                    y++;
                }
            }
        System.out.println(pairs);
    }
}
