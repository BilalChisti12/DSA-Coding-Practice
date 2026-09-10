package Recursions;

import java.util.Scanner;

public class removeDupInString {
    static String remDup(String s, int idx, StringBuilder res, boolean[] map){
        if(idx == s.length()){
            return res.toString();
        }

        if(!map[s.charAt(idx)-'a']){
            res.append(s.charAt(idx));
            map[s.charAt(idx)-'a'] = true;
        }
        return remDup(s, idx+1, res, map);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int idx = 0;
        boolean[] map = new boolean[26];
        StringBuilder res = new StringBuilder();
        System.out.println(remDup(s, idx, res, map));
    }
}
