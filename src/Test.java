import java.util.ArrayDeque;
import java.util.Deque;

public class Test {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.addFirst(9);
        queue.addLast(1);
        queue.offerFirst(2);
        queue.offerLast(3);
        System.out.println(queue);
        // возврашаем первую и последную
        System.out.println(queue.getFirst());
        System.out.println(queue.getLast());
        //удаляем первую и последную
        queue.removeFirst();
        queue.removeLast();
        System.out.println(queue);
        // возврашаем первую и последную
        System.out.println(queue.peekFirst());
        System.out.println(queue.peekLast());
        // удаляем первую и последную
        queue.pollFirst();
        queue.pollLast();
        System.out.println(queue);
    }
}
