package basics;

import java.util.Scanner;
public class testrepeat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int elem;
        for(int i=0;i<n;i++){
            elem = sc.nextInt();
            if(elem <= 10){
                arr[i] = elem;
            }
            else{
                System.out.print("Array can only have elements less than 10");
                i--;
            }
        }
        for(int n1: arr){
            System.out.print(n1+ " ");
        }
    }
}
