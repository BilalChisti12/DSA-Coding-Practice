package Arrays;

public class maxSubArrayProduct {
    static int subArrayProduct(int[] arr){
        int currProd = 1;
        int maxProd = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            currProd *= arr[i];
            maxProd = Math.max(maxProd, currProd);
            if(currProd<0) currProd=1;
        }
        return maxProd;
    }

    public static void main(String[] args) {
        int[] arr = {-2,0,1};
        System.out.println(subArrayProduct(arr));
    }
}
