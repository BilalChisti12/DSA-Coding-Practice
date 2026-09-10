package Recursions;

public class print1toNBktrk {
    public static void f(int n){
        f(n, n+1);
    }
    public static void f(int n, int c){
        if(c == 1) return;
        f(n, --c);
        System.out.print(c+" ");
    }

    static void main() {
        f(5);
    }
}
