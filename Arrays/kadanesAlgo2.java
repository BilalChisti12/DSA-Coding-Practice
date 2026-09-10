package Arrays;

public class kadanesAlgo2 {
    public static void main() {
        int[] arr = {1,2,3,4,5,-20,25};
        int max = Integer.MIN_VALUE;
        int cur = 0;
        boolean allNegs = true;
        for(int i=0; i<arr.length; i++){

            cur = cur+arr[i] > 0 ? cur+arr[i] : 0;
            max = Math.max(max, cur);
        }
        for(int i=0; i< arr.length;i++){
            if(arr[i]>=0){
                allNegs=false;
                break;
            }
        }
        if(allNegs){
            int min = Integer.MIN_VALUE;
            for(int i=0; i<arr.length; i++){
                min = Math.max(min, arr[i]);
            }
            max = min;
        }
        System.out.println(max);
    }
}
