package LinkedList;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(2);
        ll.add(5);
        ll.addFirst(1);
        ll.addLast(7);
        System.out.println(ll);

        ll.removeFirst();
        System.out.println(ll);

    }
}

