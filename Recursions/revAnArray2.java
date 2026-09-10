package Recursions;

public class revAnArray2 {
    public static void f(int[] arr){
        f(arr,0);
    }
    public static void f(int[] arr, int l){
        int n = arr.length;
        if(l >= (n-l-1)) return;
        int temp = arr[l];
        arr[l] = arr[n-l-1];
        arr[n-l-1] = temp;
        f(arr, l+1);
    }

    static void main() {
        int[] arr = {1,2,3,4,5};
        f(arr);
        for(int i=0; i<5; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
