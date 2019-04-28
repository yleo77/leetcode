
package hd;

import java.util.Arrays;

class Solution {
  public int hammingDistance(int x, int y) {
    int ret = 0;
    // 查找不同的二进制位
    int diff = x ^ y;

    while (diff > 0) {
      // 通过按位与, 来判断最低位是否为 1. 为 1 则结果+1
      int bit = diff & 1;
      if(bit > 0) {
        ret = ret + 1;
      }
      // 右移, 最高位补零.
      diff = diff >> 1;
    }
    return ret;
  }
}

/**
 * Answer
 */
public class Answer {

  public static void main(String[] args) {

    Solution sol = new Solution();
    int ret = sol.hammingDistance(1, 4);

    System.out.println(ret);
  }
}
