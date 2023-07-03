package string;

public class LagestOddNumberString {

    public static void main(String[] args) {
        System.out.println(largestOddNumber("52"));

    }
    public  static String largestOddNumber(String num) {
        int n = num.length() -1 ;
        if (num.charAt(n) % 2 == 1) return  num;
        int i = n ;
        while (i >= 0 ){
            if (num.charAt(i) % 2 == 1) break;
            i--;
        }
        return num.substring(0 , i+1);

    }
    public  static String largestOddNumber1(String num) {
        int n = Integer.parseInt(num);

        if(n % 2 != 0 ) return  Integer.toString(n);
        int max = 0 ;

        while (n != 0 ){
            int dig = n % 10 ;
            if (dig == 0 ) return  "";
            if(dig % 2 != 0){
                if (max < dig){
                    max = dig ;
                }
            }
            n = n / 10 ;
        }
        return Integer.toString(max);

    }
}
