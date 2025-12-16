import java.util.*;

class StackQueue{

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void Push(int a){
        s1.push(a);
    }

    int Pop()  {
        if(s1.isEmpty()) return -1;
        // step 1 -> sabko s2
        while(!s1.isEmpty()) {
            int x = s1.pop();
            s2.push(x);
        }
        int ans = s2.pop();
        // waapis saari value s1
        while(!s2.isEmpty()) {
            int x = s2.pop();
            s1.push(x);
        }
        return ans;
    }
}

class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackQueue s = new StackQueue();
        int q = scanner.nextInt();

        while (q-- > 0) {
            int queryType = scanner.nextInt();
            if (queryType == 1) {
                int a = scanner.nextInt();
                s.Push(a);
            } else if (queryType == 2) {
                System.out.print(s.Pop() + " ");
            }
        }
    }
}
