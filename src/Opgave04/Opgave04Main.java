package Opgave04;

public class Opgave04Main {
    public static String reverse(String s) {
        String result = "";
        if(s.length() <= 0) {
            return result;
        }
        result += s.substring(s.length() - 1);
        result += reverse(s.substring(0,s.length() - 1));
        return result;
    }
}
