package Day_5;

//URL : https://leetcode.com/problems/is-subsequence/

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int sidx = 0, sedx = s.length();
        int tidx = 0, tedx = t.length();
        while(sidx < sedx && tidx < tedx) {
            if(s.charAt(sidx) == t.charAt(tidx))
                sidx++;
            tidx++;
        }
        return sidx == sedx;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));
    }
}
