import java.util.*;

public class Main {

    public static List<Integer> asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<asteroids.length;i++) {
            st.push(asteroids[i]);
            while(st.size() > 1) {
                int as2 = st.pop();
                int as1 = st.pop();

                // as1>0 && as2 < 0
                if(!(as1>0 && as2<0)) {
                    st.push(as1);
                    st.push(as2);
                    break;
                }

                if(Math.abs(as1)==Math.abs(as2)) continue;
                if(Math.abs(as1) < Math.abs(as2)) st.push(as2);
                else st.push(as1);
            }
        }

        List<Integer> ans = new ArrayList<>();
        while(!st.isEmpty()) {
            ans.add(st.pop());
        }

        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] asteroids = new int[n];

        for (int i = 0; i < n; i++) {
            asteroids[i] = scanner.nextInt();
        }

        List<Integer> ans = asteroidCollision(asteroids);

        if(ans.size()==0){
            System.out.print(-1);
        }else{
            for (int asteroid : ans) {
                System.out.print(asteroid + " ");
            }
        }
    }
}
