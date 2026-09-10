package Strings;
import java.util.Scanner;
import java.util.Arrays;
public class anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr1 = sc.nextLine().toCharArray();
        char[] arr2 = sc.nextLine().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.print("Given string is an anagram");
        }
        else{
            System.out.print("Not an anagram");
        }
    }
}
