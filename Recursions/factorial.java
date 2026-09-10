package Recursions;

public class factorial {
    public static int f(int n){
        if(n == 1) return 1;
        return n*f(n-1);
    }

    static void main() {
        System.out.println(f(4));
    }
}
