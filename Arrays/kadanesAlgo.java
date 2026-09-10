package Arrays;
//import java.util.Scanner;
public class kadanesAlgo {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int[] arr = {-3,-5,-4,-1,-4,-7};
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int num: arr){
//            curSum = curSum + arr[i] > 0 ? curSum + arr[i] : 0;
            curSum = Math.max(curSum + num, 0);
            maxSum = Math.max(curSum, maxSum);
        }
        boolean allnegs = true;
        for(int num : arr){
            if(num >=0){
                allnegs = false;
                break;
            }
        }
        if(allnegs){
            int ms = Integer.MIN_VALUE;
            for(int num : arr){
                ms = Math.max(ms, num);
            }
            maxSum = ms;
        }
        System.out.println(maxSum);
    }
}
