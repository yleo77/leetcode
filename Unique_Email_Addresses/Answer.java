package uea;

import java.util.HashSet;
import java.util.Set;

/**
 * Answer
 */
public class Answer {

  public static void main(String[] args) {

    String[] list = {"test.email+alex@leetcode.com",
      "test.e.mail+bob.cathy@leetcode.com",
      "testemail+david@lee.tcode.com"};

    Solution sol = new Solution();
    int rt = sol.numUniqueEmails(list);

    System.out.println(rt);
  }
}

class Solution {
  public int numUniqueEmails(String[] emails) {

    Set<String> set = new HashSet<>();
    for (String email : emails) {

      int pos = email.indexOf("@");
      String local = email.substring(0, pos);
      String rest = email.substring(pos);

      pos = local.indexOf("+");
      if(pos >= 0) {
        local = local.substring(0, pos);
      }
      local = local.replaceAll(".", "");
      set.add(local + rest);
    }
    return set.size();
  }
}
