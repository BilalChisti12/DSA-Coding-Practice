package Recursions;

public class sumOfN2 {
    public static int f(int n){
        if(n == 0) return 0;
        return n+f(--n);
    }

    static void main() {
        System.out.println(f(5));
    }
}
