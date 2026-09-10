package Arrays;

import java.util.Scanner;

public class maxProductSubset {
    public static void main() {
        int[] arr = {-1,-2,-3,1,2,3};
        int product = 1;
        int minNeg = Integer.MIN_VALUE;
        int negCount=0;
        int zeroC=0;
        for(int  i=0; i<arr.length; i++){
            if(arr[i] == 0){
                zeroC++;
                continue;
            }
            if(arr[i] <0){
                negCount++;
                minNeg = Math.max(minNeg, arr[i]);
            }
            product*=arr[i];
        }
        if(zeroC == arr.length || (negCount==1 && negCount+zeroC==arr.length)){
            product=0;
        }
        else if(negCount%2 == 1){
            product/=minNeg;
        }
        System.out.println(product);
    }
}
