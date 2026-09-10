package Strings;

public class lettersToUpperCase {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        String str = "hello world, i am bilal chisti";
        sb1.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i-1) == ' '){
                sb1.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb1.append(str.charAt(i));
            }
        }
        System.out.println(sb1);
    }
}
