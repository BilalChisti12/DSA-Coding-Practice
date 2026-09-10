package basics;

import java.util.Scanner;

public class powerof4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        while(n > 0){
            if(n % 4 != 0){
                flag = false;
                break;
            }
            n /= 4;
        }
        if(flag){
            System.out.println("power of 4");
        }
        else{
            System.out.println("not a power of 4");
        }
    }
}
