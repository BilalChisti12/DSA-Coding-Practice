package Recursions;

import java.util.Scanner;

public class startAndEndSameChar {
    static int sameCharStEnd(String s, int[] map){
        int ans=0;
        if(s.isEmpty()){
            return ans;
        }
        for(int i=0; i<s.length(); i++){
            map[s.charAt(i)-'a']++;
            ans += map[s.charAt(i)-'a'];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] map = new int[26];
        int count = sameCharStEnd(s,map);
        System.out.println(count);
    }
}
