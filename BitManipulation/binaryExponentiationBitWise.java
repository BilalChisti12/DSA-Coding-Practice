package BitManipulation;

public class binaryExponentiationBitWise {
    public static void main(String[] args) {
        int x = 2;
        int n = 3;
        int ans = 1;
        while(n >0){
            if((n&1) == 1){
                ans*=x;
            }
            n >>=1; // in int, odd/2 = whole no.
            x*=x;
        }
        System.out.println(ans);
    }
}
