import java.util.ArrayList;

public class ArraylistConcept {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

//        arr.add(10);
//        arr.add(20);
//        arr.add(30);
//        arr.add(40);
//
//        System.out.println(arr.get(2));
//        System.out.println(arr.size());
//
//        arr.remove(2);
//        System.out.println(arr.get(2));
//
//        int b[] = new int[10];
//
//        System.out.println(b);
//        System.out.println(arr);
//
//        arr.clear();
//        System.out.println(arr.size());

        ArrayList<String> a = new ArrayList<>();
        a.add("Kohli");
        a.add("Rohit");
        a.add("Bumrah");
        a.add("Siraj");

        System.out.println(a.size());
        a.remove(1);
        System.out.println(a);
        a.clear();
        System.out.println(a);




    }
}
