package string;

import java.util.HashMap;

public class SortACharByFrequency {
    public static void main(String[] args) {
        System.out.println( frequencySort("tree"));

    }
    public  static String frequencySort(String s){

        int [] arr = new int[123];
        // why 123 because we have to store both  Small And big chr
        for (int i = 0; i < s.length(); i++) {
            arr[(int) s.charAt(i)]++;
        }
        StringBuilder ans = new StringBuilder();

        while (true){
            // find the max value out of it
            int max = 0 ;
            for (int i = 0; i < 123; i++) {
                if (arr[i] > arr[max]) max = i ;
            }
            char c = (char)  max;
            // now append the maxi value to the ans one my one
            // we have to append the number of char according to there frequency
            for (int i = 1 ; i <= arr[max] ; i++){
                ans.append(c);
            }
            // after enter the higest frequency we have to add  make to zero so we can add rest of the char
            arr[max] = 0 ;
            if (ans.length() == s.length()){
                return ans.toString();
            }

        }
    }
//    public String frequencySort(String s) {
//        // creat a hasmap to store the frequency
//        StringBuilder ans = new StringBuilder();
//        HashMap<Character , Integer> hash = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            hash.put(c ,hash.getOrDefault(c , 0)+1);
//        }
//        int max = 0 ;
//        char b ;
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if ( max < hash.get(c) ){
//                max = hash.get(c);
//                 b = c ;
//            }
//        }
//        for (int i = 0; i < s.length(); i++) {
//            ans.append(b);
//
//
//        }
//
//
//
//    }
}
