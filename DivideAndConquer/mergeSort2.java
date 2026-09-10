package DivideAndConquer;

public class mergeSort2 {
    static void mergeSor(int[] arr, int si, int ei){
        if(ei<=si){
            return;
        }
        int mid = si + (ei-si)/2;

        mergeSor(arr, si, mid);
        mergeSor(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }
    static void merge(int[] arr,int si, int mid, int ei){
        int i = si;
        int j = mid+1;
        int k = 0;
        int[] temp = new int[ei-si+1];
        while(i<= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        for(i = si, k = 0; i<=ei; i++, k++){
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,5,4,6,1};
        mergeSor(arr, 0, 4);
        for(int i=0; i<5; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
