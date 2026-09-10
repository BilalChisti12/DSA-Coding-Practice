package Strings;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        for(char ch='a'; ch<='z'; ch++){
            sb1.append(ch);
        }
        System.out.println(sb1);
    }
}
