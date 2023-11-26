package stringprobleams;

public class StringCompare {
    static void stringCompareTest(){
        String s1 = "Vinay";
        String s2 = "Vinay";
        String s3 = new String("Vinay");

        if (s1 == s2){
            System.out.println("String are equal");
        }else {
            System.out.println("String are not equal");
        }

        if (s1 == s3){
            System.out.println("String are equal");
        }else {
            System.out.println("String are not equal");
        }

        if (s1.equals(s3)){
            System.out.println("String are equal");
        }else {
            System.out.println("Not equal");
        }
    }

    static String eachFirstLetterUppercase(String string){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Character.toUpperCase(string.charAt(0)));
        for (int i=1; i<string.length(); i++){
            if (string.charAt(i) == ' ' && i < string.length() - 1){
                stringBuilder.append(string.charAt(i));
                stringBuilder.append(Character.toUpperCase(string.charAt(i+1)));
                i++;
            }else {
                stringBuilder.append(string.charAt(i));
            }
        }
        return stringBuilder.toString();

    }
    public static void main(String[] args) {
        stringCompareTest();
        System.out.println(eachFirstLetterUppercase("i my name is vinay haryan"));
    }
}
