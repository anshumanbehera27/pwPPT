package string;

import java.util.Stack;

public class RemoveOuterMost {
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }
    public static String removeOuterParentheses(String s) {

        // creat a stack
        Stack<Character> st = new Stack<>();

        // creat a ans string bulider to append one by one
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '('){
                if (st.size() > 0){
                    sb.append(ch);
                }
                st.add(ch);

            }
            else {
                st.pop();
                if (st.size() > 0){
                    sb.append(ch);
                }
            }

        }
        return sb.toString();

    }
}
