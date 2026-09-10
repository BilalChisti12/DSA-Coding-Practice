package basics;

import java.util.Scanner;

public class bintodec {
    public static int decnum(int binnum){
        int decnum=0;
        int pow=0;
        int lastDigit;
        while(binnum>0){
            lastDigit = binnum%10;
            if(lastDigit!=0 && lastDigit != 1){
                return -1;
            }
            binnum=binnum/10;
            decnum += lastDigit*((int)Math.pow(2,pow));
            pow++;
        }
        return decnum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binnum = sc.nextInt();
        int decnum = decnum(binnum);
        if(decnum==-1){
            System.out.println("Enter a valid binary number combination of only 0s and 1s!");
        }
        else{
            System.out.println("The decimal form of the given binary number is: "+decnum);
        }
    }
}
