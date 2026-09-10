package Strings;

public class largestString {
    public static void main(String[] args) {
        String str2 = "aabbce";
        String str1 = "aabbcd";
        System.out.println(str1.compareToIgnoreCase(str2));
        String[] arr = {"apple","mango","banana"};
        String largest = arr[0];
        for(int i=1; i<arr.length; i++){
            if(largest.compareToIgnoreCase(arr[i]) < 0){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
