package tlc;

class Solution {

  public String toLowerCase(String str) {

    String rs = "";

    for (int i = 0; i < str.length(); i++) {
      char temp = str.charAt(i);
      if(temp >= 'A' && temp <= 'Z') {
        temp = (char) (temp + 32);
      }
      rs = rs + temp;
    }

    return rs;
  }
}

/**
 * Answer
 */
public class Answer {

  public static void main(String[] args) {
    String str = "Hello";
    Solution sol = new Solution();

    sol.toLowerCase(str);
  }
}
