package Arrays;
import java.util.Scanner;
public class prefixSum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] preSum = new int[n];
        preSum[0] = arr[0];
        for(int i=1; i<n; i++){
            preSum[i] = preSum[i-1] + arr[i];
        }
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j=i; j< n; j++){
                sum = i==0 ? preSum[j] : preSum[j] - preSum[i-1];
            }
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println(maxSum);
    }
}
