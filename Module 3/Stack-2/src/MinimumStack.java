import java.util.*;

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            int q = sc.nextInt();
            Solution g = new Solution();
            while(q>0)
            {
                int qt = sc.nextInt();

                if(qt == 1)
                {
                    int att = sc.nextInt();
                    g.push(att);
                }
                else if(qt == 2)
                {
                    System.out.print(g.pop()+" ");
                }
                else if(qt == 3)
                {
                    System.out.print(g.getMin()+" ");
                }

                q--;
            }
            System.out.println();
            T--;
        }
        sc.close();

    }
}

class Pair {
    int ele;
    int minEle;
    Pair(int ele, int minEle) {
        this.ele = ele;
        this.minEle = minEle;
    }
}

class Solution
{
    Stack<Pair> s;

    Solution()
    {
        s = new Stack<Pair>();
    }

    void push(int x){
        if(s.isEmpty()) s.push(new Pair(x,x));
        else {
            int min = Math.min(x,s.peek().minEle);
            s.push(new Pair(x,min));
        }
    }

    int pop(){
        if(s.isEmpty()) return -1;
        return s.pop().ele;
    }

    int getMin(){
        if(s.isEmpty()) return -1;
        return s.peek().minEle;
    }
}
