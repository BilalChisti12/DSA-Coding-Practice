package BitManipulation;

public class swapCase {
    public static void main(String[] args) {
        char a = 'a';
        char b = (char)(a|(1<<5));
        System.out.println(b);
        char c = (char)(a&~(1<<5));
        System.out.println(c);
    }
}
