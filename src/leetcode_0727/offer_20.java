package leetcode_0727;

public class offer_20 {
    public boolean isNumber(String s) {
        boolean isDot = false;
        boolean isE_or_e = false;
        boolean isDigit = false;
        s = s.trim();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= '0' && ch <= '9') {
                isDigit = true;
            } else if (ch == '.') {
                if(isDot || isE_or_e) {
                    return false;
                }
                isDot = true;
            } else if (ch == 'e' || ch == 'E') {
                if(isE_or_e || !isDigit) {
                    return false;
                }
                isE_or_e = true;
                isDigit = false;
            } else if(ch == '+' || ch == '-') {
                if(i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
            } else {
                return false;
            }
        }
        return isDigit;
    }
}
