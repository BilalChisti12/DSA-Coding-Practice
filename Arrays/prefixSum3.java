package Arrays;
//import java.util.Scanner;
public class prefixSum3 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int[] preSum = new int[5];
        preSum[0] = arr[0];
        for(int i=1; i<5; i++){
            preSum[i] = preSum[i-1] + arr[i];
        }
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<5; i++){
            for(int j=i; j<5; j++){
                int sum = i==0 ? preSum[j] : preSum[j] - preSum[i-1];
                maxSum = Math.max(maxSum, sum);
            }
        }
        System.out.println(maxSum);
    }
}
