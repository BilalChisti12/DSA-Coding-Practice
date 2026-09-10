package DivideAndConquer;

import java.util.Scanner;

public class mergeSort {
    static void mergeSor(int[] arr, int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si +(ei-si)/2;
        mergeSor(arr, si, mid);
        mergeSor(arr,mid+1, ei);
        merge(arr, si, mid, ei);
    }

    static void merge(int[] arr, int si, int mid, int ei){
        int[] temp = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        for(k = 0, i=si; i<=ei; i++, k++){
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        mergeSor(arr, 0, arr.length-1);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
