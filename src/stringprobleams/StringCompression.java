package stringprobleams;

public class StringCompression {
    static String stringCompression(String string){
        StringBuilder stringBuilder = new StringBuilder();
        int i=0;
        while (i < string.length()){
            char character = string.charAt(i);
            int count = 1;
            i++;
            while (i < string.length() && string.charAt(i) == character){
                count++;
                i++;
            }

            if (count == 1){
                stringBuilder.append(character);
            }else {
                stringBuilder.append(character).append(count);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(stringCompression("vvvinnayy"));
    }
}
