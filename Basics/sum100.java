package basics;

import java.util.Scanner;

public class sum100 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int pair =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j]==100){
                   pair++;
                }
            }
        }
        System.out.println(pair);
    }
}
