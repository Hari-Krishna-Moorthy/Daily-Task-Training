package Day_3;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static List<String> generateParenthesis(int n) {
        return generateParenthesis(new ArrayList<String>(), "", 0, 0, n);
    }
    public static List<String> generateParenthesis(ArrayList<String> ans, String p, int open, int close, int n){
        if(p.length() == n*2){
            ans.add(p);
        }
        if(open < n){
            generateParenthesis(ans, p + "(", open + 1, close, n);
        }
        if(close < open){
            generateParenthesis(ans, p + ")", open, close + 1, n);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
        System.out.println(generateParenthesis(1));
    }
}
