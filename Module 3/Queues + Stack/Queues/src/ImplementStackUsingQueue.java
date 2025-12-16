import java.io.*;
import java.util.*;
class Stack
{
    Queue<Integer> q = new LinkedList<>();
    void push(int a)
    {
        q.push(a);
    }

    int pop()
    {
        int sz = q.size();
        for(int i=0;i<sz-1;i++) {
            int x = q.pop();
            q.push(x);
        }

        return q.pop();
    }
}
public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        Stack g = new Stack();
        int q = sc.nextInt();
        while(q>0)
        {
            int QueryType = sc.nextInt();
            if(QueryType == 1){
                int a = sc.nextInt();
                g.push(a);
            }
            else if(QueryType == 2){
                System.out.println(g.pop());
            }
            q--;
        }
    }
}