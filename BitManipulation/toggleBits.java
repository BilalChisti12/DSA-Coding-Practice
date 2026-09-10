package BitManipulation;

import java.util.Scanner;

public class toggleBits {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = Integer.toBinaryString(n).length();
        int mask = (1<<len)-1;
        n=n^mask;
        System.out.println(n);
    }
}
