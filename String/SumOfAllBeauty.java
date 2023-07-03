package string;

public class SumOfAllBeauty {
    public static void main(String[] args) {
        System.out.println(beautySum("aabcb"));

    }
    public  static  int getMaxCount(int[] charcount){
        int max = 0 ;
        for (int i = 0; i < charcount.length; ++i) {
            max = Math.max(max ,charcount[i]);

        }
        return  max;
    }
    public  static int getMinCount(int[] charcount){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < charcount.length; ++i)
        {
            if (charcount[i] != 0){
                min = Math.min(min , charcount[i]);
            }
        }
        return min;
    }
    public static int beautySum(String s) {
        // we have to find every possiable substring
        // aaabcb
        int sum = 0 ;
        for (int i = 0; i < s.length() ; ++i) {
            // this is for count of number of occurance in the paticular  sub_string
            int[] charcount = new int[26];
            for (int j = i; j < s.length(); ++j) {
                 ++charcount[s.charAt(j) - 'a'];
                 int beauty = getMaxCount(charcount) - getMinCount(charcount);
                 sum += beauty;
            }
        }
        return sum;


    }
}
