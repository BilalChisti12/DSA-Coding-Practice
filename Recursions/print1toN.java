package Recursions;

public class print1toN {
    public static void f(int n){
        f(n, 1);
    }
    public static void f(int n, int c){
        if(c == n){
            System.out.print(c);
            return;
        }
        System.out.print(c+" ");
        f(n, ++c);
    }

    static void main() {
        f(5);
    }
}
