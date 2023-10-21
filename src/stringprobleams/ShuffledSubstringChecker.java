package stringprobleams;
import java.util.Map;
import java.util.HashMap;

public class ShuffledSubstringChecker {
    public static boolean isShuffledSubstring(String substring, String mainString){
        int subLength = substring.length();
        for (int i=0; i<=mainString.length() - subLength; i++){
            String currentSubstring = mainString.substring(i, i+subLength);
            if (areCharacterFrequenciesEqual(currentSubstring, substring)){
                return true;
            }
        }
        return false;
    }

    private static boolean areCharacterFrequenciesEqual(String str1, String str2){
        if (str1.length() != str2.length()){
            return false;
        }

        Map<Character, Integer> frequencyMap1 = new HashMap<>();
        Map<Character, Integer> frequencyMap2 = new HashMap<>();

        for (char c: str1.toCharArray()){
            frequencyMap1.put(c, frequencyMap1.getOrDefault(c, 0) + 1);
        }

        for (char c: str2.toCharArray()){
            frequencyMap2.put(c, frequencyMap2.getOrDefault(c, 0) + 1);
        }

        return frequencyMap1.equals(frequencyMap2);
    }

    public static void main(String[] args) {
        System.out.println(isShuffledSubstring("roseyellow", "yellow"));
    }
}