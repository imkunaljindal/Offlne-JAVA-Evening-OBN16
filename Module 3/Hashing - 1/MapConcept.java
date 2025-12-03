import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapConcept {

    public static void main(String[] args) {
//        HashMap<String,Integer> mp = new HashMap<>();
//        mp.put("Kohli",40);
//        mp.put("Rohit", 45);
//        mp.put("Jadeja",38);
//
//        mp.put("Kohli",45);
//
//        System.out.println(mp);
//
//        System.out.println(mp.get("adeja"));

        HashMap<Integer,Integer> m1 = new HashMap<>();
//        TreeMap<Integer,Integer> m1 = new TreeMap();
//        LinkedHashMap<Integer,Integer> m1 = new LinkedHashMap<>();
        m1.put(1,45);
        m1.put(23,65);
        m1.put(10,47);
        m1.put(32,98);

//        int val = m1.get(40);
//        if(m1.containsKey(40)) {
//            val = m1.get(40);
//        }
//        else {
//            val = 0;
//        }
//        int val = m1.getOrDefault(32,0);

        System.out.println(m1.keySet());
        System.out.println(m1.values());

        for(int key: m1.keySet()) {
            System.out.println("Key = "+key + " value = "+ m1.get(key));
        }

    }
}
