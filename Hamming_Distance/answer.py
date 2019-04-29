class Solution:
    def hammingDistance(self, x: int, y: int) -> int:
        ret = 0
        diff = x ^ y
        while diff > 0:
            bit = diff & 1
            if bit > 0:
                ret = ret + 1
            diff = diff >> 1
        return ret


sol = Solution()
print(sol.hammingDistance(1, 4))
