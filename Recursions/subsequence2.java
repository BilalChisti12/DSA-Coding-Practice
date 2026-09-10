package Recursions;
import java.util.*;
public class subsequence2 {
    public static void f(int[] arr, int k){
        f(0, arr, new ArrayList<>(), k);
    }
    public static void f(int i, int[] arr, ArrayList<Integer> list, int k){
        if(i>=arr.length){
            int sum=0;
            for(int num:list){
                sum+=num;
            }
            if(sum == k){
                System.out.println(list);
            }
            return;
        }
        list.add(arr[i]);
        f(i+1, arr, list, k);
        list.removeLast();
        f(i+1, arr, list, k);
    }

    static void main() {
        int[] arr = {3,1,2};
        f(arr, 4);
    }
}
