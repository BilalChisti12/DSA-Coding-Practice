package Recursions;

import java.util.ArrayList;

public class subsequenceWithSumK {
    public static boolean f(int i, int[] arr, ArrayList<Integer> list, int sum, int k){
        if(i== arr.length){
            if(sum == k){
                System.out.println(list);
                return true;
            }
            return false;
        }
            list.add(arr[i]);
            if (f(i+1, arr, list, sum+arr[i], k)) return true;
            list.removeLast();
            return f(i+1, arr, list, sum, k);
    }

    static void main() {
        int[] arr = {1,2,1};
        f(0, arr, new ArrayList<>(), 0, 2);
    }
}
