package basics;

import java.util.*;

public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int op = sc.next().charAt(0);
        int b = sc.nextInt();
        switch (op){
            case '+':
                System.out.print(a+b);
                break;
            case '-':
                System.out.print(a-b);
                break;
            case '*':
                System.out.print(a*b);
                break;
            case '/':
                System.out.print((float)a/b);
                break;
            case '^':
                System.out.print((int)Math.pow(a,b));
                break;
        }

    }
}
