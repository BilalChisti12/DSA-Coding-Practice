package Arrays;
import java.math.BigInteger;
public class bigIntegerOperations {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("12345678901234567890");
        BigInteger b = BigInteger.valueOf(42);
        BigInteger sum = a.add(b);
        BigInteger diff = a.subtract(b);
        BigInteger prod = a.multiply(b);
        BigInteger quot = a.divide(b);
        BigInteger rem = a.mod(b);
        System.out.println(sum+" "+diff+" "+prod+" "+quot+" "+rem);
    }
}

