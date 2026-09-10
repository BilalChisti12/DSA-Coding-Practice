package Backtracking;

public class permutations {
    static void findPerm(String s,String  ans){
        if(0 == s.length()){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<s.length(); i++) {
            char curr = s.charAt(i);
            s = s.substring(0,i)+s.substring(i+1);
        }
    }
}
