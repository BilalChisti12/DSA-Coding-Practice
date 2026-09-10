package BitManipulation;

public class clearithBit {
    public static void main(String[] args) {
        int n = 10;
        int i = 2;
        n &= ~(1<<i);
        System.out.println(n);
    }
}
