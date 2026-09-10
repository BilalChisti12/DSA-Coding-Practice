package Arrays;

import java.util.Scanner;
public class kadanesalgo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        boolean flag = false;
        int curSum = 0;
//        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            curSum += arr[i];
            if(curSum % n == 0){
                flag = true;
                break;
            }
            if(curSum < 0){
                curSum = 0;
            }
        }
        if(flag){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
//        System.out.println(maxSum);
    }
}
