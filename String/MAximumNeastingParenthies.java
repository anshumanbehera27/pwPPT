package string;

public class MAximumNeastingParenthies {
    public int maxDepth(String s) {
        int open  = 0 ;
        int depth = 0 ;
        for (char c : s.toCharArray()){
            if (c == '('){
                open++;
            }
            if (c == ')'){
                open--;
            }
            depth = Math.max(depth , open);
        }
        return depth;

    }
}
