package week03;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println("==size: " + queue.size());
        System.out.println(queue.element()); // 첫번째 요소 반환
        System.out.println("==size: " + queue.size());
        System.out.println(queue.poll()); // 첫번째 요소 삭제
        System.out.println("==size: " + queue.size());
        System.out.println(queue.remove()); // 첫번째 요소 삭제
        System.out.println("==size: " + queue.size());
        System.out.println(queue.peek());
    }
}
