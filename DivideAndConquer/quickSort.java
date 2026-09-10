package DivideAndConquer;

public class quickSort {
    static void quickSor(int[] arr, int si, int ei){
        if(ei<=si) return;
        int pIdx = getIdx(arr, si,ei);
        quickSor(arr, si, pIdx-1);
        quickSor(arr, pIdx+1, ei);
    }

    static int getIdx(int[] arr, int si, int ei){
        int pivot = arr[ei];
        int temp;
        int i = si-1;
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
        int[] arr = {2,3,5,1,4};
        quickSor(arr, 0, 4);
        for(int i=0; i<5; i++){
            System.out.println(arr[i]);
        }
    }
}
