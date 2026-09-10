package Strings;
import java.util.Scanner;
public class stringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        int count;
        for(int i=0; i<str1.length(); i++){
            count = 1;
            while(i<str1.length()-1 && str1.charAt(i) == str1.charAt(i+1)){
                count++;
                i++;
            }
            if(count>1){
                sb.append(str1.charAt(i)+""+count);
            }
            else{
                sb.append(str1.charAt(i));
            }
        }
        System.out.print(sb);
    }
}
