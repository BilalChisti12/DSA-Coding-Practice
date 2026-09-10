package Arrays;

public class maxSubArraySum3 {
    static int subArraySum(int[] arr){
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int currSum=0;
            for(int j=i; j<n; j++){
                currSum += arr[j];
                maxSum = Math.max(currSum, maxSum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,-50,-1,-2,30};
        System.out.println(subArraySum(arr));

    }
}
