package BitManipulation;

public class clearLastiBits {
    public static void main(String[] args) {
        int n = 15;
        int i = 2;
        n &= (-1)<<i;
        System.out.println(n);
    }
}
