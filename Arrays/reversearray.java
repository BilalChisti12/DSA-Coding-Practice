package Arrays;

import java.util.Scanner;

public class reversearray {
    public static int[] reverse(int[] arr){
        int first = 0;
        int last = arr.length-1;
        while(first < last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        arr = reverse(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
