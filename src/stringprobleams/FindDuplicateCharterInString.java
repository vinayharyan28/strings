package stringprobleams;
import java.util.HashMap;
import java.util.Map;


public class FindDuplicateCharterInString {
    public static HashMap<Character, Integer> findDuplicateCharter(String s){
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i=0; i<s.length(); i++){
            if (hashMap.containsKey(s.charAt(i))){
                hashMap.put(s.charAt(i), hashMap.get(s.charAt(i))+1);
            }else {
                hashMap.put(s.charAt(i), 1);
            }
        }
        return hashMap;
    }

    public static void main(String[] args){
        HashMap<Character, Integer> result = findDuplicateCharter("geeksforgeeks");
        for (Map.Entry<Character, Integer> entry: result.entrySet()){
            if (entry.getValue() > 1)
                System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

    }
}
