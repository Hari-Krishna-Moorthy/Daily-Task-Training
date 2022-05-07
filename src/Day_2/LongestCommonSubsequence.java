package Day_2;

//URL : https://leetcode.com/problems/longest-common-subsequence/

public class LongestCommonSubsequence {
    private static Integer[][] dp = null;
    public static int longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length(), len2 = text2.length();
        if(dp == null)
            dp = new Integer[len1+1][len2+1];
        return longestCommonSubsequence(text1, text2, len1-1, len2-1);
    }

    private static int longestCommonSubsequence(String s1, String s2, int len1, int len2) {
        if(len1 < 0 || len2 < 0)
            return 0;
        if(dp[len1][len2] != null)
            return dp[len1][len2];
        if(s1.charAt(len1) == s2.charAt(len2)) {
            return dp[len1][len2] = 1 + longestCommonSubsequence(s1, s2, len1-1, len2-1);
        } else {
            return dp[len1][len2] = Math.max(
                    longestCommonSubsequence(s1, s2,len1-1,len2),
                    longestCommonSubsequence(s1, s2, len1,len2-1)
            );
        }
    }

    public static void main(String[] args) {
        System.out.println(longestCommonSubsequence("Hello", "Hee"));
    }
}
