package Arrays;

public class secondLargest {
    static int secLrgst(int[] arr){
        int largest = arr[0];
        int seclarge = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                seclarge = largest;
                largest = arr[i];
            }
            else if(arr[i] > seclarge && arr[i] != largest){
                seclarge = arr[i];
            }
        }
        return seclarge;
    }

    public static void main(String[] args) {
        int[] arr = {11,21,41,34,10,41};
        int res = secLrgst(arr);
        System.out.println(res);
    }
}
