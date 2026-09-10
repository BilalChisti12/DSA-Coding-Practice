package Basics.Patterns;
import java.util.Scanner;
public class triangle3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n+1; i++){
            for(int j=1; j<=n+1; j++){

                if(i<j){
                    System.out.print("* ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
