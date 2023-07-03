package string;

import java.util.Arrays;
import java.util.Locale;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        // base case
        if (strs.length == 1) return  strs[0];
        // we are able to sort this one
        Arrays.sort(strs);

        int len = strs[0].length();

        StringBuilder  ans = new StringBuilder();
        int c = 0 ;
        while (c < len){
            if (strs[0].charAt(c) == strs[strs.length -1].charAt(c)){
                ans.append(strs[0].charAt(c));
            }
            else break;
            c++;
        }
        return ans.toString();



    }
}
