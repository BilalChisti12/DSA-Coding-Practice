package basics;

import java.util.Scanner;

public class dectoanybaseconversion {
    public static int baseconversion(int num, int tobase){
        int lastDigit;
        int pow=0;
        int result=0;
        while(num>0){
            lastDigit = num%10;
            if(lastDigit >= tobase){
                return -1;
            }
            num = num/10;
            result+= lastDigit*(int)Math.pow(tobase,pow);
            pow++;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        System.out.print("Enter the base of the number you want to convert to");
        int base=sc.nextInt();
        int result=baseconversion(num,base);
        if(result==-1){
            System.out.println("Enter a number strictly with respect to base!");
        }
        else{
            System.out.println(num+" base 10 converted to base "+base+" is: "+result);
        }
    }
}
