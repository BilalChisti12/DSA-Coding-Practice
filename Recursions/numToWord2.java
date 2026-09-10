package Recursions;

public class numToWord2 {
    static void getWord(int n, StringBuilder sb){
        if(n == 0){
            return;
        }
        String[] arr = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        getWord(n/10, sb);
        sb.append(arr[n%10]+" ");
    }

    public static void main(String[] args) {
        int n = 2019;
        StringBuilder sb = new StringBuilder();
        getWord(n,sb);
        System.out.println(sb);
    }
}
