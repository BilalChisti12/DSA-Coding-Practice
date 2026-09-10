package Backtracking;

public class bktrkArray {
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void getRes(int[] arr, int i){
        if(i == arr.length) return;
        arr[i] = i+1;
        getRes(arr, i+1);
        arr[i] = arr[i]-2;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printArray(arr);
        getRes(arr,0);
        printArray(arr);
    }
}
