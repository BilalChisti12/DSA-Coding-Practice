package Recursions;

public class quickSort2 {
    public static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length-1);
    }
    public static void quickSort(int[] arr, int l, int r){
        if(l>=r) return;
        int p = f(arr, l, r);
        quickSort(arr, l,p-1);
        quickSort(arr, p+1, r);
    }

    public static int f(int[] arr, int l, int r){
        int i=l;
        int j=r;
        int pivot = arr[l];
        while(i<j){
            while(i<=r-1 && arr[i] <= pivot){
                i++;
            }
            while(j>=l+1 && arr[j] >= pivot){
                j--;

            }
            if(i<j){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp = arr[l];
        arr[l]=arr[j];
        arr[j]=temp;
        return j;

    }

    static void main() {
        int[] arr = {5,4,3,2,1};
        quickSort(arr);
        for(int i=0; i<5; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
