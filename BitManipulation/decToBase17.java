package BitManipulation;

import java.util.Scanner;

public class decToBase17 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n, 17);
        System.out.println(s);
    }
}
