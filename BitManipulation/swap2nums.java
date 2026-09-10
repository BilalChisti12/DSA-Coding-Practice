package BitManipulation;

public class swap2nums {
    public static void main(String[] args) {
        int a=10, b =5;
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a);
        System.out.println(b);
        //or
        a=10;
        b=5;
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a);
        System.out.println(b);
    }
}
