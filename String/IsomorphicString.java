package string;

import java.util.HashMap;

public class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {

        // base case
        if (s.length() != t.length()) return  false;

        // creat map for store the char to char realation
        HashMap<Character , Character> map1 = new HashMap<>();
        // creat a map for check it is alread use or not
        HashMap<Character , Boolean> map2 = new HashMap<>();
        // compare the both of the string
        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if (map1.containsKey(ch1) == true){
                if (map1.get(ch1) != ch2){
                    return  false;
                }
            }
            else {
                if (map2.containsKey(ch2) == true){
                    return false;
                }
                else {
                    map1.put(ch1 , ch2);
                    map2.put(ch2 , true);
                }
            }

        }
        return true;

    }
}
