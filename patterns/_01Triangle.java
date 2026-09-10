package patterns;

import java.util.Scanner;

public class _01Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int[] arr = {1,0};
//        int ind=0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
//                if(ind > 1){
//                    ind = 0;
//                }
//                System.out.print(arr[ind]+" ");
//                ind++;
                if((i+j) % 2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
