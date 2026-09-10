package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class rankElements {
    public static void main() {
        int[] arr = {23, 6, 4, 6, 1};
        int[] copy = arr.clone();
        Arrays.sort(copy);
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;
        for (int i = 0; i < 5; i++) {
            if (map.containsKey(copy[i])) {
                map.put(copy[i], map.get(copy[i]));
            } else {
                map.put(copy[i], rank++);
            }
        }
        for (int i = 0; i < 5; i++) {
            copy[i] = map.get(arr[i]);
            System.out.print(copy[i] + " ");
        }

    }
}

