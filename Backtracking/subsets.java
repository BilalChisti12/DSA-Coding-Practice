package Backtracking;

public class subsets {
    static void getSubsets(String s, String ans, int i){
        if(i == s.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        getSubsets(s, ans+s.charAt(i), i+1);
        getSubsets(s, ans, i+1);
    }

    public static void main(String[] args) {
        String s = "abc";
        getSubsets(s, "", 0);
    }
}
