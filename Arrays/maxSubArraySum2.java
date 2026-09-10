package Arrays;
import java.util.Scanner;
public class maxSubArraySum2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        int  maxSum = Integer.MIN_VALUE;
        for(int i=1; i<n; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
        int start,end;
        for(int i = 0; i< n; i++){
            start = i;
            for(int j=i; j<n; j++){
                end = j;
                if(start == 0){
                    maxSum = Math.max(maxSum, prefixSum[end]);
                }
                else{
                    maxSum = Math.max(maxSum, prefixSum[end] - prefixSum[start-1]);
                }
            }
        }
        System.out.println(maxSum);
    }
}
