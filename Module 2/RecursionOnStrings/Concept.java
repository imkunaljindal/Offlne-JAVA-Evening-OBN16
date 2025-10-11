import java.util.HashSet;
import java.util.Set;

public class Concept {

    public static void main(String[] args) {

        Set<Integer> st = new HashSet<>();
        st.add(5);
        st.add(6);
        st.add(5);
        st.add(7);

        System.out.println(st);
    }
}
