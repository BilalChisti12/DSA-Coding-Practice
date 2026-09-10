package Arrays;

import java.util.Scanner;

public class kadanesalgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            curSum += arr[i];
            maxSum = Math.max(curSum, maxSum);
            if(curSum < 0){
                curSum = 0;
            }
        }
        System.out.println(maxSum);
    }
}
