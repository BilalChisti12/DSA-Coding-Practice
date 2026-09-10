package Arrays;

public class minSwaps {
    public static void main() {
        int[] b = {50,20,40,10};
        int[] a = {10,20,50,40};
        int swapC=0;
        for(int i=0; i<a.length; i++){
            if(a[i] != b[i]){
                int idx = i+1;
                while(a[idx] != b[i]){
                    idx++;
                }
                int temp = a[i];
                a[i] = a[idx];
                a[idx] = temp;
                swapC++;
            }
        }
        System.out.println(swapC);
    }
}
