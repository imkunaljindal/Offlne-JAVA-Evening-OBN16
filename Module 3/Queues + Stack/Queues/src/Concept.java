import java.util.ArrayDeque;
import java.util.Queue;

public class Concept {

    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();

        q.add(10);
        q.add(20);
        q.add(15);
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q.poll());
        System.out.println(q.peek());
    }
}
