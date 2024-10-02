package org.example.LeetCodeDSA;

import java.util.Stack;

public class ValidParanthesis {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '(':
                    st.push(c);
                    break;
                case '{':
                    st.push(c);
                    break;
                case '[':
                    st.push(c);
                    break;
                case ')':
                    if (!st.isEmpty() && st.peek() == '(') {
                        st.pop();
                    } else return false;
                    break;
                case '}':
                    if (!st.isEmpty() && st.peek() == '{') {
                        st.pop();
                    } else return false;
                    break;
                case ']':
                    if (!st.isEmpty() && st.peek() == '[') {
                        st.pop();
                    } else return false;
                default:
                    ;
            }
        }
        return st.isEmpty();

    }

    public static void main(String[] args) {
        ValidParanthesis validParanthesis = new ValidParanthesis();
        String s="([{}])";
        System.out.println(validParanthesis.isValid(s));

    }
}
