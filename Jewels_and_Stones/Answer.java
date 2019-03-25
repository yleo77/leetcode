package jas;

/**
 * Answer
 */
public class Answer {

  public static void main(String[] args) {
    String J = "aA";
    String S = "aAAbbbb";

    Solution sol = new Solution();
    int n = sol.numJewelsInStones(J, S);

    System.out.println(n);
  }
}

/**
 * Solution
 */
class Solution {
  public int numJewelsInStones(String J, String S) {

    int jl = J.length();
    int sl = S.length();

    if (jl == 0 || sl == 0) {
      return 0;
    }

    int rt = 0;
    for (int i = 0; i < jl; i++) {

      for (int j = 0; j < sl; j++) {

        if(J.charAt(i) == S.charAt(j)) {
          rt = rt + 1;
        }
      }
    }

    return rt;
  }
}
