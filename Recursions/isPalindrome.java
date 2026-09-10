package Recursions;

public class isPalindrome {
    public static boolean f(String s){
        return f(s, 0);
    }
    public static boolean f(String s, int l){
        int n = s.length();
        if(l>=n-l-1) return true;
        if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(n-l-1))) return false;
        return f(s, l+1);
    }

    static void main() {
        String s = "madamm";
        System.out.println(f(s));
    }
}
