package Basics;

public class palindrome {
    public static void main() {
        String s = "aabaaaa";
        int l=0;
        int r=s.length()-1;
        for(int i=0; i<(s.length()/2); i++){
            l=i;
            if(s.charAt(l) != s.charAt(r)){
                System.out.println("False");
                break;
            }
            r--;
        }
        if(l == (s.length()/2)){
            System.out.println("True");
        }
    }
}
