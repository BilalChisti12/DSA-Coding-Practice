package Recursions;

import java.util.Scanner;

public class lastOccurence {
    static int lastOcc(int[] nums, int x, int i){
        if(i == -1){
            return -1;
        }
        if(nums[i] == x){
            return x;
        }
        return lastOcc(nums, x, i-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {1,2,3,4,5,6,7,8,8,9};
        int n = nums.length-1;
        System.out.println(lastOcc(nums, 8, n));
    }
}
