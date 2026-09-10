package Recursions;

public class printNto1Bktrk {
    public static void f(int n){
        f(n, 0);
    }
    public static void f(int n, int c){
        if(c == n) return;
        f(n, ++c);
        System.out.print(c+" ");
    }

    static void main() {
        f(5);
    }
}
