import java.io.*;
import java.util.*;

class Solution {

    public void EmpUnderManager(Map<String, String> emp) {
        HashMap<String, ArrayList<String>> directEmpMap = new HashMap<>();
        String ceo = "";

        for (String key : emp.keySet()) {
            String manager = emp.get(key);
            if (manager.equals(key)) {
                ceo = key;
            } else {
                if (!directEmpMap.containsKey(manager)) {
                    directEmpMap.put(manager, new ArrayList<>());
                }
                ArrayList<String> reportees = directEmpMap.get(manager);
                reportees.add(key);
                directEmpMap.put(manager, reportees);
            }
        }
        HashMap<String, Integer> ans = new HashMap<>();
        getEmpUnderMe(ceo, ans, directEmpMap);
        for (String k : ans.keySet()) {
            System.out.println(k + " " + ans.get(k));
        }
    }

    private int getEmpUnderMe(String manager,
                              HashMap<String, Integer> ans,
                              HashMap<String, ArrayList<String>> directEmpMap) {
        if (!directEmpMap.containsKey(manager)) {
            ans.put(manager, 0);
            return 1;
        }

        int totalEmpUnderMe = 0;
        for (String emp : directEmpMap.get(manager)) {
            totalEmpUnderMe += getEmpUnderMe(emp, ans, directEmpMap);
        }
        ans.put(manager, totalEmpUnderMe);
        return totalEmpUnderMe + 1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        Map<String, String> emp = new HashMap<String, String>();
        for (int i = 0; i < n; ++i) {
            emp.put(sc.next(), sc.next());
        }
        Solution Obj = new Solution();
        Obj.EmpUnderManager(emp);
    }
}