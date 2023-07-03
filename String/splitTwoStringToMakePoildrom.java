package string;

public class splitTwoStringToMakePoildrom {
    public static void main(String[] args) {

    }
    public boolean checkPalindromeFormation(String a, String b) {
        return check(a , b) || check(b,a);


    }
    public  boolean check(String a , String b){
        int l =  0 ;
        int r = b.length() -1 ;
        while (l < r && a.charAt(l) == b.charAt(r)){
            l++;
            r--;
        }
        if (l >= r) return  true;
        return ispolidrom(a.substring(l , r+1)) || ispolidrom(b.substring(l , r+1));
    }
    public boolean ispolidrom(String s){
        int l =  0 ;
        int r = s.length() -1 ;
        while (l < r && s.charAt(l) == s.charAt(r)){
            l++;
            r--;
        }
        return l >= r;
    }
}
