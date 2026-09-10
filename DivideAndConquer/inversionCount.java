package DivideAndConquer;

public class inversionCount {
    static int totalCount=0;
    static void quickSort(int[] arr, int si, int ei){
        if(ei<=si) return;
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx+1, ei);
    }

    static int partition(int[] arr, int si, int ei){
        int i = si-1;
        int pivot = arr[ei];
        for(int j= si; j<=ei; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        totalCount++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        quickSort(arr, 0, 4);
        System.out.println(totalCount);
    }
}
