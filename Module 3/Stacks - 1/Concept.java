import java.util.Stack;

public class Concept {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.peek());
        

//        System.out.println(st.size());
//        boolean isEmpty = st.isEmpty();
//        System.out.println(isEmpty);
//
//        st.clear();
//        System.out.println(st.isEmpty());

//        System.out.println(st);
//
//        System.out.println(st.peek());
//        int x = st.pop();
//        System.out.println(x);
//        System.out.println(st.peek());
    }
}
