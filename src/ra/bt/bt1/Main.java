package ra.bt.bt1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Queue<Integer>queue = new LinkedList<>();
        for (int i = 0; i <10 ; i++) {
            queue.offer((int) (Math.random()*10));

            System.out.println(queue.element());
        }
        System.out.println(queue);
    }
}
