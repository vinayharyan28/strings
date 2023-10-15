package stringprobleams;

public class ReverseString {
    public static StringBuilder reverseString(String s){
        StringBuilder reversed = new StringBuilder();
        for (int i=s.length()-1; i>=0; i--){
            reversed.append(s.charAt(i));
        }
        return reversed;
    }

    public static String reveseString(String input){
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    public static void main(String[] args){
        System.out.println(reverseString("vinay"));
        System.out.println(reveseString("haryan"));
    }
}
