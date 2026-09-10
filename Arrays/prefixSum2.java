package Arrays;

public class prefixSum2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum;
        int[] preSum = new int[arr.length];
        preSum[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            preSum[i] = preSum[i-1] + arr[i];
        }
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                sum = i==0 ? preSum[j] : preSum[j] - preSum[i-1];
                maxSum = Math.max(maxSum, sum);
            }

        }
        System.out.println(maxSum);

    }
}
