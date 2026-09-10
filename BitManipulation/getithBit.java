package BitManipulation;

public class getithBit {
    public static void main(String[] args) {
        int n = 6;
        int i = 2;
        n&=(1<<i);
        if(n == 0){
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }
//        System.out.println(n & (1<<i));
    }
}
