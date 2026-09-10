package BitManipulation;

public class clearRangeOfBits {
    public static void main(String[] args) {
        int n = 255;
        int i=2,j=6;
        int a = 1<<j+1;
        //i and j inclusive. If you want to exclude i, replace below i-1 to i or
        // if j to exclude,replace above j+1 with j
        int b = (int)Math.pow(2,i-1)-1;
        int bitMask = a|b;
        n &= bitMask;
        System.out.println(n);
    }
}
