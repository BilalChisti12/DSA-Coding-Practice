package Recursions;


public class printNto1 {
    public static void f(int n){
        if(n == 0) return;
        System.out.print(n+" ");
        f(--n);
    }

    static void main() {
        f(5);
    }
}

