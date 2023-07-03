package string;

public class roateString {

    public static void main(String[] args) {
        System.out.println(rotateString("abcde" , "cdeab"));

    }
    public static  boolean rotateString(String s, String goal){
        if (s == null || goal == null ) return  false;

        if (s.length() != goal.length()) return  false;

        if (s.length() == 0 ) return  true;
        for (int i = 0; i < s.length(); i++) {
            if (rotate(s , goal , i)) return true;

        }
        return false;


    }
    public static boolean rotate(String a , String b , int rotation){
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt((i + rotation ) % b.length())){
                return  false;
            }

        }
        return  true;

    }
//    public static  boolean rotateString(String s, String goal) {
//        //  case length must be same
//        if (s.length() != goal.length()) return  false;
//
//        // creat a string builder to compare with the gole
//        StringBuilder temp = new StringBuilder();
//
//        for (int i = 0; i < s.length(); i++) {
//            if(!temp.isEmpty()) temp.deleteCharAt(0);
//            temp.append(s.charAt(i));
//            if (temp.toString().equals(goal)) return  true;
//
//
//        }
//        return false;
//
//    }
    }
