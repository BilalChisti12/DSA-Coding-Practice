package Recursions;

public class sumOfN {
    public static int sum(int n){
        return sum(n, 0);
    }
    public static int sum(int n, int res){
        if(n == 0) return res;
        return sum(n-1, res+n);
    }

    static void main() {
        System.out.println(sum(5));
    }
}
