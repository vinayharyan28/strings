package stringprobleams;

public class Palindrome {
    public static boolean checkStringIsPalindromeOrNot(String s){
        int startIndex=0, endIndex=s.length()-1;
        while (startIndex < endIndex){
            if (s.charAt(startIndex) == s.charAt(endIndex)){
                startIndex++;
                endIndex--;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(checkStringIsPalindromeOrNot("vinay"));
        System.out.println(checkStringIsPalindromeOrNot("abba"));
    }
}
