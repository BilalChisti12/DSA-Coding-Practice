package Recursions;

public class mergeSort {
    public static void mergeS(int[] arr, int l, int r){
        if(l>=r) return;
        int m = l+(r-l)/2;
        mergeS(arr, l, m);
        mergeS(arr, m+1, r);
        merge(arr, l, m, r);
    }
    public static void merge(int[] arr, int l, int m, int r){
        int[] res = new int[r-l+1];
        int i=l;
        int j=m+1;
        int x=0;
        while(i<=m && j<=r){
            if(arr[i] < arr[j]){
                res[x++] = arr[i++];
            }
            else{
                res[x++] = arr[j++];
            }
        }
        for(int a=i; a<=m; a++){
            res[x++] = arr[a];
        }
        for(int a= j; a<=r; a++){
            res[x++] = arr[a];
        }
        int y=l;
        for(int n: res){
            arr[y++]=n;
        }
    }

    static void main() {
        int[] arr = {5,4,6,3,2,1};
        mergeS(arr, 0, arr.length-1);
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}