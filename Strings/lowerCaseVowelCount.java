package Strings;
import java.util.Scanner;
public class lowerCaseVowelCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vowels = "aeiou";
        String str = sc.nextLine();
        int count=0;
        for(int i=0; i<str.length(); i++){
            if(vowels.contains(String.valueOf(str.charAt(i)))){
                count++;
            }
        }
        System.out.println(count);
    }
}
