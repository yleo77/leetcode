package twosum;

import java.util.HashMap;

/**
 * Answer
 */
public class Answer {

  public static void main(String[] args) {
    int[] nums = {2,7,11,15};
    int target = 9;

    Solution sol = new Solution();
    int[] rt = sol.twoSum(nums, target);
  }
}

class Solution {

  public int[] twoSum(int[] nums, int target) {

    int[] ret = new int[2];
    HashMap<Integer, Integer> obj = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      if (obj.containsKey(target - nums[i])) {
        ret[0] = i;
        ret[1] = obj.get(target - nums[i]);
        return ret;
      }

      obj.put(nums[i], i);
    }

    return ret;
  }
}
