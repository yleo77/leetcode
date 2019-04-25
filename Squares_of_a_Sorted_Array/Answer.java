package soasa;

import java.util.Arrays;

class Solution {
  public int[] sortedSquares(int[] A) {

    int[] ret = new int[A.length];
    int i = 0;
    for (int n : A) {
      int x = Math.abs(n);
      ret[i] = x * x;
      i = i + 1;
    }

    Arrays.sort(ret);
    return ret;
  }
}

/**
 * Answer
 */
public class Answer {

  public static void main(String[] args) {
    int[] x = {-4,-1,0,3,10};

    Solution sol = new Solution();
    int[] ret = sol.sortedSquares(x);

    System.out.println(ret);
  }
}
