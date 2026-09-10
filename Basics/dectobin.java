package basics;

import java.util.Scanner;

public class dectobin {
    public static int tobin(int num){
        int result=0;
        int temp = 1;
        int num1;
        while(num>0){
            num1 = num % 2;
            result+= num1*temp;
            temp*=10;
            num/=2;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int bin = tobin(num);
        System.out.println("The decimal "+num+" converted to binary is: "+bin);
//        int result = Integer.parseInt(Integer.toBinaryString(num));
//        System.out.println("The decimal "+num+" converted to binary is: "+result);
    }
}