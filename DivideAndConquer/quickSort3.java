package DivideAndConquer;

public class quickSort3 {
    static void quickSort(int[] arr, int si, int ei){
        if(ei<=si) return;
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx+1, ei);
    }

    static int partition(int[] arr, int si, int ei){
        int pivot = arr[ei];
        int i = si-1;
        for(int j=si; j<=ei; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        i++;
        arr[ei] = arr[i];
        arr[i] = pivot;
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,4,2};
        quickSort(arr, 0, 4);
        for(int i=0; i<5; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
