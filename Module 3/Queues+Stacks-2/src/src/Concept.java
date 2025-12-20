import java.util.ArrayDeque;

public class Concept {

    public static void main(String[] args) {
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.addFirst(10);
        q.addLast(20);
        q.addFirst(30);

        System.out.println(q.pollFirst());
        System.out.println(q.peekLast());
        System.out.println(q.pollLast());


    }
}
