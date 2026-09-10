package BitManipulation;

public class updateithBit {
    public static void main(String[] args) {
        int n = 10;
        int i =2;
        int setBit = 0;
//        n &= ~(1<<i);
        if(setBit == 0){
            n &= ~(1<<i);
        }
        else if(setBit == 1){
            n |= (1<<i);
        }
        System.out.println(n);
    }
}
