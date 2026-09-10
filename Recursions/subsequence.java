package Recursions;
import java.util.*;
public class subsequence {
    public static void subsequence1(int index, int[] arr, ArrayList<Integer> list) {

        if(index == arr.length) {
            System.out.println(list);
            return;
        }

        // take
        list.add(arr[index]);
        subsequence1(index + 1, arr, list);

        list.remove(list.size() - 1);

        // not take
        subsequence1(index + 1, arr, list);
    }

    static void main() {
        int[] arr = {1,2,3};
        subsequence1(0, arr, new ArrayList<>());
    }
}
