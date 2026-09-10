package Strings;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int strlen = str.length();
        boolean isPalindrome = true;
        int j = strlen-1;
        for(int i=0; i<(strlen/2); i++){
            if(str.charAt(i) != str.charAt(j)){
                isPalindrome = false;
                break;
            }
            else{
                j--;
            }
        }
        if(isPalindrome){
            System.out.print("The entered string is a Palindrome");
        }
        else{
            System.out.print("The entered string is not a Palindrome");
        }
    }
}