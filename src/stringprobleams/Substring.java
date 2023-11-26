package stringprobleams;

public class Substring {
    static String substringTest(String string, int startIndex, int endIndex){
        String substring = "";
        for(int i=startIndex; i<endIndex; i++){
            substring += string.charAt(i);
        }
        return substring;
    }

    public static void main(String[] args) {
        String string = "Hello World";
        System.out.println(string.substring(0, 4));
        System.out.println(substringTest(string, 0, 4));

    }
}
