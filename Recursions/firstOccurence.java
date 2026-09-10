package Recursions;

//import java.util.Scanner;

public class firstOccurence {
    static int _1stOcc(int[] nums, int x, int i){
        if(i == nums.length){
            return -1;
        }
        if(nums[i] == x){
            return i;
        }
        return _1stOcc(nums, x, i+1);
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int[] nums = {1,2,3,8,4,5,6,7,8,9};
        System.out.println(_1stOcc(nums, 8, 0));
    }
}
