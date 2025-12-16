import java.io.*;
import java.util.*;

class StackQueue
{
    //Function to push an element in queue by using 2 stacks.
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    void Push(int x)
    {
        while(!s1.isEmpty()) {
            int a = s1.pop();
            s2.push(a);
        }
        s1.push(x);
        while(!s2.isEmpty()) {
            int a = s2.pop();
            s1.push(a);
        }

    }
    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
        if(s1.isEmpty()) return -1;
        return s1.pop();
    }
}
public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        StackQueue s = new StackQueue();
        int q = sc.nextInt();
        ArrayList<Integer> ans= new ArrayList<>();
        while(q>0)
        {
            int QueryType = sc.nextInt();
            if(QueryType == 1)
            {
                int a = sc.nextInt();
                s.Push(a);
            }
            else if(QueryType == 2)
                ans.add(s.Pop());
            q--;
        }
        for(int x:ans)
            System.out.print(x+" ");
        System.out.println();
    }
}