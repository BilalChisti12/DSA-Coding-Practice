package Recursions;

public class subArray {
    static void printSubarray(int[] arr, int idx){
        if(idx == arr.length) return;
        for(int i=idx; i<arr.length; i++){
            for(int j=idx; j<=i; j++){
                System.out.print(arr[j]);
            }
            System.out.println();
        }
        printSubarray(arr, idx+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printSubarray(arr,0);
    }
}
