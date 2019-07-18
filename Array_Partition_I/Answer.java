package api;
import java.util.Arrays;

class Solution {

    public int arrayPairSum(int[] nums) {

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int sum = 0;
        for (int i = 0; i < nums.length ; i = i + 2) {
            sum = sum + nums[i];
        }

        return sum;
    }
}

public class Answer {

    public static void main(String[] args) {

        Solution sol = new Solution();
        int[] x = {1,4,3,2};
        int sum = sol.arrayPairSum(x);
        System.out.println(sum);
    }
}

