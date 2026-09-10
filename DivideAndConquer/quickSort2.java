package DivideAndConquer;

public class quickSort2 {
    static void quickSor(int[] arr, int si, int ei){
        if(ei<=si) return;
        int pIdx = partition(arr, si, ei);
        quickSor(arr, si, pIdx-1);
        quickSor(arr, pIdx+1, ei);
    }

    static int partition(int[] arr, int si, int ei){
        int pivot = arr[ei];
        int i = si-1;
        int temp;
        for(int j = si; j<ei; j++){
            if(arr[j] < pivot){
                i++;
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,3,2,5};
        quickSor(arr, 0 , 4);
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}
