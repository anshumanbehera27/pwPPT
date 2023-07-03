//package string;
//
//public class repetratedSubStringPattrent {
//    public static void main(String[] args) {
//        System.out.println(repeatedSubstringPattern("abab"));
//
//    }
//    public static boolean repeatedSubstringPattern(String s) {
//        if (s.length() == 1 ) return  true;
//
//        int  r  = 0 ;
//        char ch = s.charAt(0);
//        for (int j = 1; j < s.length(); j++) {
//            char tf = s.charAt(j);
//            r ++ ;
//            if (ch == tf) break;
//        }
//        String chek = s.substring(0 , r );
//        String rest = s.substring(r+1 , s.length());
//
//
//        if(rest.contains(chek)) return  true ;
//        return  false;
//    }
//
//}
