package rol;


class Solution {

    public String reverseOnlyLetters(String S) {

        char[] chars = S.toCharArray();
        int len = S.length();

        int i = 0;
        int j = len - 1;

        while (i < j) {

            // 反转字母, 但要保证非字母位置不变
            while (i < j && !isCharacter(chars[i])) {
                i++;
            }
            while (i < j && !isCharacter(chars[j])) {
                j--;
            }

            if(i > j) {
                break;
            }

            char c = chars[i];
            chars[i] = chars[j];
            chars[j] = c;
            i++;
            j--;
        }

        return String.valueOf(chars);
    }

    private boolean isCharacter(char c) {
        // A- Z: 65 - 90
        // a-z: 97 - 122
        return ((c >= 65 && c <= 90) || (c >= 97 && c <= 122));
    }
}

/**
 * Answer
 */
public class Answer {

    public static void main(String[] args) {
        Solution sol = new Solution();

        String x = "a-bC-dEf-ghIj";
        System.out.println(x);
        String str = sol.reverseOnlyLetters(x);
        System.out.println(str);
    }
}
