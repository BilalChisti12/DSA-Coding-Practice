package Arrays;

//import java.util.Scanner;

public class maxAInBox {
    public static void main() {
//        Scanner sc = new Scanner(System.in);
        String s = "bbbaaababa";
        int l = 3;
        int res=0;
        int i=0;
        int count=0;
        int max = Integer.MIN_VALUE;
        while(i<s.length()){
            while(i<s.length() && count<l){
                if(s.charAt(i) == 'a') {
                    res++;
                }
                i++;
                count++;
            }
            max= Math.max(max, res);
            res=0;
            count=0;
        }
        System.out.println(max);
    }
}
