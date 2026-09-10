package Arrays;

public class kadanesAlgo2 {
    static int subArraySum(int[] arr){
        int curSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            curSum += arr[i];
            maxSum = Math.max(maxSum, curSum);
            if(curSum<0) curSum=0;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,-5,-1,-2,30};
        System.out.println(subArraySum(arr));
    }
}
