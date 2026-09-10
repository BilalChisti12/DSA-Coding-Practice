package Recursions;

import java.util.Scanner;

public class numToWord {
    static String getWord(int n){
        if (n == 1) {
            return "one ";
        } else if (n == 2) {
            return "two ";
        } else if (n == 3) {
            return "three ";
        } else if (n == 4) {
            return "four ";
        } else if (n == 5) {
            return "five ";
        } else if (n == 6) {
            return "six ";
        } else if (n == 7) {
            return "seven ";
        } else if (n == 8) {
            return "eight ";
        } else if (n == 9) {
            return "nine ";
        }
        return "zero ";
    }
    static String[] getNWord(int n, int idx,String[] res){
        if(n == 0){
            return res;
        }
        res[idx] = getWord(n%10);
        return getNWord(n/10, idx+1, res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] res = new String[(int)Math.log10(n)+1];
        getNWord(n, 0, res);
        for(int i=(int)Math.log10(n); i>=0; i--){
            System.out.print(res[i]);
        }
    }
}
