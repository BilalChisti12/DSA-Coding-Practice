package Basics;
import java.util.Scanner;
public class fizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count3=0;
        int count5=0;
        for(int i=1; i<=n; i++){
            count3++;
            count5++;
            if(count3 != 3 && count5 != 5){
                System.out.print(i);
            }
            if(count3 == 3){
                System.out.print("Fizz");
                count3=0;
            }
            if(count5 == 5){
                System.out.print("Buzz");
                count5 =0;
            }
            System.out.println();
        }
    }
}
