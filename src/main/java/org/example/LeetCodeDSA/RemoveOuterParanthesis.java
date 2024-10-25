package org.example.LeetCodeDSA;

public class RemoveOuterParanthesis {

        public String removeOuterParentheses(String s) {
            StringBuilder sb = new StringBuilder();
            int open = 0;

            for (char c : s.toCharArray()) {
                if (c == '(') {
                    if (open > 0) sb.append(c); // Only add if it’s not the outermost '('
                    open++;
                } else {
                    open--;
                    if (open > 0) sb.append(c); // Only add if it’s not the outermost ')'
                }
            }

            return sb.toString();
        }

    public static void main(String[] args) {
        RemoveOuterParanthesis obj=new RemoveOuterParanthesis();
        String s="(())(())";
        System.out.println(obj.removeOuterParentheses(s));
    }



}
