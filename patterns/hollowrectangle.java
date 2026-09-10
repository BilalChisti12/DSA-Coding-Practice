package patterns;

import java.util.Scanner;

public class hollowrectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        for(int i=1;i<=length;i++){
            for(int j=1;j<=width;j++){
                if(j == 1 || j == width || i == 1 || i == length){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
//            if(i == 1 || i == length){
//                System.out.print("*");
//            }
//            else{
//                System.out.print(" ");
//            }
            System.out.println();
        }
    }
}
