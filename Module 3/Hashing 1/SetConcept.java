import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetConcept {

    public static void main(String[] args) {
//        HashSet<Integer> st = new HashSet<>();
//        st.add(10);
//        st.add(2);
//        st.add(45);
//        st.add(10);
//        st.add(100);
//        st.add(5);
//
//        System.out.println(st);
//        System.out.println(st.size());
//
//        st.remove(10);
//        System.out.println(st);
//
//        System.out.println(st.isEmpty());
//
//
//        HashSet<String> s1 = new HashSet<>();
//        s1.add("abc");
//        s1.add("xyz");
//        s1.add("Abc");
//        s1.add("abc");
//
//        s1.remove("abc");
//
//        System.out.println(s1);

        TreeSet<Integer> st = new TreeSet<>();
//        LinkedHashSet<Integer> st = new LinkedHashSet<>();
        st.add(10);
        st.add(4);
        st.add(20);
        st.add(12);

        for(int x: st) {
            System.out.println(x);
        }

        System.out.println(st);
    }
}
