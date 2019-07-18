from typing import List

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:

        nums.sort()
        return sum(nums[::2])


sol = Solution()
nums = [1, 4, 2, 3]

print(sol.arrayPairSum(nums))
