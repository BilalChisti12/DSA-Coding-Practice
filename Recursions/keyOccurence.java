package Recursions;

import java.util.ArrayList;

public class keyOccurence {
    static ArrayList<Integer> keyOcc(int[] arr,int idx, int key, ArrayList<Integer> res){
        if(idx == arr.length){
            return res;
        }
        if(arr[idx] == key){
            res.add(idx);
        }
        return keyOcc(arr, idx+1, key, res);
    }

    public static void main(String[] args) {
        int[] arr = {3,2,4,5,6,2,7,2,2};
        ArrayList<Integer> res = new ArrayList<>();
        keyOcc(arr, 0, 2, res);
        System.out.println(res);
    }
}
