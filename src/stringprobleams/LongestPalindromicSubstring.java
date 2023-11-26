package stringprobleams;

/**
 * Step1 (Initialization): The dynamic programming table `dp` is a 2D array where `dp[i][j]` is `true` if the substring from index `i` to index `j` is a palindrome.
   The base case is initialized for single characters (`dp[i][i] = true`)
 * Step2 (Check for palindrome of Length2): The code checks for palindromes of length 2 (`s.charAt(i) == s.charAt(i+1)` and updates the `dp` table accordingly.
   The `start` and `maxLength` variables are updated if a longer palindrome is found.
 * Step3 (Check for Palindromes of length3 or more): Nested loops iterate through all possible substring lengths greater than 2.
   If the characters at the ends are the same and the substring inside is a palindrome (dp[i + 1][j - 1]), then the current substring is also a palindrome, and the dp table is updated.
   The start and maxLength variables are again updated if a longer palindrome is found.
 */
public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s){
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int start = 0;
        int maxLength = 1;

        //Step 1: Initialize the base case - single characters are palindromes
        for (int i=0; i<n; i++){
            dp[i][i] = true;
        }

        //Step 2: Check for palindromes of length 2
        for (int i=0; i<n-1; i++){
            if (s.charAt(i) == s.charAt(i+1)){
                dp[i][i+1] = true;
                start = i;
                maxLength = 2;
            }
        }

        // Step 3: Check for palindromes of length 3 or more
        for (int length = 3; length <= n; length++){
            for (int i=0; i<n-length + 1; i++){
                int j = i + length - 1;
                // Check if the characters at the ends are the same, and the substring inside is a palindrome
                if (s.charAt(i) == s.charAt(j) && dp[i+1][j-1]){
                    dp[i][j] = true;
                    // If the current palindrome is longer than the previous one, update start and maxLength
                    if (length > maxLength){
                        start = i;
                        maxLength = length;
                    }
                }
            }
        }
        // Step 4: Return the longest palindromic substring
        return s.substring(start, start + maxLength);
    }

    public static void main(String[] args){
        String input = "Geeks"; //"forgeeksskeegfor";
        String result = longestPalindrome(input);
        System.out.println(result);
    }
}
