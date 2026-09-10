package Recursions;
import java.util.*;
public class subsequencesWithSumK {
    public static int numSubseq(int[] nums, int target) {
        return numSubseq(0, nums, new ArrayList<>(), target, 0, 0);
    }
    public static int numSubseq(int i, int[] nums, ArrayList<Integer> list, int k, int c, int sum){
        if(i>= nums.length){
            if(sum == k) {
                c++;
                System.out.println(list);
            }

            return c;
        }
        list.add(nums[i]);
        c = numSubseq(i+1, nums, list, k, c, sum+nums[i]);
        list.removeLast();
        c = numSubseq(i+1, nums, list, k, c, sum);
        return c;
    }

    static void main() {
        int[] arr = {1,2,1};
        System.out.println(numSubseq(arr, 2));
    }
}
