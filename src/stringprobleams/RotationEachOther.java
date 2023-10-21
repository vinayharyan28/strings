package stringprobleams;

public class RotationEachOther {
    public static boolean isRotate(String str1, String str2){
        if (str1.length() != str2.length()){
            return false;
        }

        String mergedString = str1 + str1;
        return mergedString.contains(str2);
    }

    public static void main(String[] args){
        System.out.println(isRotate("abcd", "cdab"));
    }
}