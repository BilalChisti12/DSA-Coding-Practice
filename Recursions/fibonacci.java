package Recursions;

public class fibonacci {
    public static int f(int n){
        if(n<=1) return n;
        return f(n-1)+f(n-2);
    }

    static void main() {
        System.out.println(f(4));
    }
}
