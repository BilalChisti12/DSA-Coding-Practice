package Arrays;

import java.util.Scanner;

public class maxSubArraySum1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum = 0;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                for(int k=i; k<=j; k++){
                    sum += arr[k];
                }
                max = Math.max(sum, max);
                sum=0;
            }
        }
        System.out.println("The maximum sum possible from subarrays in the array is: "+max);
    }
}
