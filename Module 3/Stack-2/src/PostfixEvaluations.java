import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        Solution ob = new Solution();
        ob.evaluation(exp);
    }
}

class Solution {

    public boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '%');
    }

    public int calculate(int op1, int op2, char c) {
        if (c == '+') return op1 + op2;
        if (c == '-') return op1 - op2;
        if (c == '*') return op1 * op2;
        if (c == '/') return op1 / op2;
        return op1 % op2;
    }

    public int solve(String exp) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            if (isOperator(c)) {
                int op2 = st.pop();
                int op1 = st.pop();
                int val = calculate(op1, op2, c);
                st.push(val);
            } else st.push(c - '0');
        }

        return st.peek();
    }

    public String postfixToPrefix(String exp) {
        Stack<String> st = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (isOperator(c)) {
                String op2 = st.pop();
                String op1 = st.pop();
                st.push(c + op1 + op2);
            } else st.push(c + "");
        }

        return st.peek();
    }

    public String postfixToInfix(String exp) {
        Stack<String> st = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (isOperator(c)) {
                String op2 = st.pop();
                String op1 = st.pop();
                st.push("(" + op1 + c + op2 + ")");
            } else st.push(c + "");
        }

        return st.peek();
    }

    public void evaluation(String exp) {
        System.out.println(solve(exp));
        System.out.println(postfixToInfix(exp));
        System.out.println(postfixToPrefix(exp));
    }
}                         