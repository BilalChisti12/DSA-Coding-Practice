package Recursions;

public class printName {
    public static void f(int c){
        if(c == 0) return;
        System.out.println("Labbaik Yaa RasoolAllah");
        f(--c);
    }

    public static void main() {
        int c = 5;
        f(5);
    }
}
