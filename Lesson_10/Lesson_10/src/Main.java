import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(7);
        queue.add(9);
        queue.offer(6);
        queue.offer(2);

        queue.forEach(i -> System.out.print(i + "\t"));
        System.out.println();

        System.out.println("Phần tử đầu tiên: " + queue.element());
        System.out.println("Phần tử đầu tiên: " + queue.peek());
        //Nếu queue không có phần tử -> element ném ra ngoại lệ NoSuchElementException
        //còn peek trả về Null
        System.out.println();

        Deque<Integer> deque = new LinkedList<>();
        deque.add(5);
        deque.add(7);
        deque.add(1);
        deque.add(9);
        deque.addFirst(0);
        deque.addLast(10);
        deque.forEach(i -> System.out.print(i + "\t"));
        System.out.println();
    }
}
