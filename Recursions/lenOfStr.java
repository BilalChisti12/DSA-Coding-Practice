package Recursions;

import java.util.Scanner;

public class lenOfStr {
    static int strLen(String s){
        if(s.isEmpty()) return 0;

        return 1+strLen(s.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(strLen(s));
    }
}
