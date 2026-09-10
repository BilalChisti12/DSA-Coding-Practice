package Basics;
import java.util.*;
public class list {
    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<>();
        Stack<Integer> stacks = new Stack<>();
        stacks.push(21);
        stacks.push(20);
        stacks.pop();
        int n = stacks.peek();
        System.out.println(stacks);
        System.out.println(n);
        lists.add(stacks.pop());
        lists.add(stacks.push(20));
        System.out.println(lists);
        System.out.println(stacks);
    }
}
