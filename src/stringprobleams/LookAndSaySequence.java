package stringprobleams;

public class LookAndSaySequence {
    public static String lookAndSay(int n){
        if (n == 1){
            return "1";
        }

        String currentTerm = "1";
        for (int i=2; i<=n; i++){
            currentTerm = generateNextTerm(currentTerm);
        }

        return currentTerm;
    }

    public static String generateNextTerm(String term){
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i=1; i<term.length(); i++){
            if (term.charAt(i) == term.charAt(i-1)){
                count++;
            }else{
                result.append(count).append(term.charAt(i-1));
                count = 1;
            }
        }

        result.append(count).append(term.charAt(term.length() - 1));
        return result.toString();
    }

    public static void main(String[] args){
        int n=5;
        String result = lookAndSay(n);
        System.out.println(result);
    }
}
