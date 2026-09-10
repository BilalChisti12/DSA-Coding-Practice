package DivideAndConquer;

public class inversionCount2 {
    static void mergeSort(int[] arr, int si, int ei){
        if(ei<=si) return;
        int mid = si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid , ei);
    }
    static int totCount=0;
    static void merge(int[] arr, int si, int mid, int ei){
        int i=si;
        int j=mid+1;
        int k=0;
        int[] temp = new int[ei-si+1];
        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                totCount+= mid-i+1;
                temp[k++] = arr[j++];
            }
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[j++];
        }

        for(i=0, k=si; k<=ei; i++,k++){
            arr[k] = temp[i];
        }

    }

    public static void main(String[] args) {
        int[] arr = {5,3,2,4,1};
        mergeSort(arr, 0, 4);
        System.out.println(totCount);
    }
}
