package BitManipulation;

public class fastExponentiation {
    public static void main(String[] args) {
        int x = 2;
        int n = 3;
        int ans = 1;
        while(n>=1){
            if(n%2 == 0){
                x*=x;
                n/=2;
            }
            else{
                ans*=x;
                n--;
            }
        }
        System.out.println(ans);
    }
}
