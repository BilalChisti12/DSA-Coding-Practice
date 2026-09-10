package Recursions;

public class towersOfHanoi {
    static void hanoi(int n, char a, char b, char c){
        if(n == 1){
            System.out.println("Move "+a+" to "+b);
            return;
        }
        hanoi(n-1, a, c, b);
        System.out.println("Move "+a+" to "+b);
        hanoi(n-1, c, b, a);

    }

    public static void main(String[] args) {
        char a = 'A', b = 'B', c='C';
        hanoi(3,a,b,c);
    }
}
