package Recursions;

//import java.util.Scanner;

public class sortedOrNot {
    static boolean isSorted(int[] nums,int i){
        if(i == nums.length-1){
            return true;
        }
        if(nums[i] > nums[i+1]) {
            return false;
        }
        return isSorted(nums, i+1);
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int[] nums = {1,3,2,4,5};
        System.out.println(isSorted(nums, 0));
    }
}
