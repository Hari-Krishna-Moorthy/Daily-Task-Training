package Day_5;

public class ReverseString {
    public static void reverseString(char[] s) {
        int i = 0;
        while(i < (s.length - i - 1)) {
            char ch = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i++ - 1] = ch;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(s);
        s = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString(s);
        System.out.println(s);
    }
}
