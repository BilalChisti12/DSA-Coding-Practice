package LinkedLists;

import java.util.LinkedList;

class Node{
    int data;
    public Node next;
}
public class first {
    public static void main() {
        Node node1 = new Node();
        node1.data=1;
        Node node2 = new Node();
        node2.data=2;
        node1.next=node2;
        node2.next=null;
        while(node1!=null){
            System.out.println(node1.data);
            node1=node1.next;
        }
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        System.out.println(ll);
    }
}
