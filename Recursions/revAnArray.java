package Recursions;

public class revAnArray {
    public static void f(int[] arr, int l, int r){
        if(r<=l) return;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        f(arr, l+1, r-1);
    }

    static void main() {
        int[] arr = {1,2,3,4,5};
        f(arr, 0, 4);
        for(int i=0; i<5; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
