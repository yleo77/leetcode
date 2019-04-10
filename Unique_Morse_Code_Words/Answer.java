package umcw;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Answer
 */
public class Answer {

  public static void main(String[] args) {

    String[] stary = {"gin", "zen", "gig", "msg"};

    Solution sol = new Solution();
    int rt = sol.uniqueMorseRepresentations(stary);

    System.out.println(rt);
  }
}

class Solution {

  private static String[] CODES = new String[] { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
      "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
  public int uniqueMorseRepresentations(String[] words) {

    Set<String> set = new HashSet();
    for (String word : words) {

      StringBuilder str = new StringBuilder();
      for (char c: word.toCharArray()){
         str.append(CODES[c - 'a']);
      }
      set.add(str.toString());
    }

    return set.size();
  }
}
