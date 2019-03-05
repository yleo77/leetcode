
class Solution {

  public boolean checkPossibility(int[] nums) {

    int l = nums.length;
    int cnt = 0;

    for (int i = 0; i < l - 1; i++) {

      if(nums[i] > nums[i+1]) {
        cnt++;
        if(i > 0) {
          // [2,5,3,4] 的情况  修改 nums[i+1]
          if(nums[i - 1] < nums[i+1]) {
            nums[i] = nums[i+1];
          // [4,5,3,7] 的情况, 修改 nums[i-1]
          } else {
            nums[i+1] = nums[i];
          }
        }
      }
    }

    return cnt <= 1;
  }
}


