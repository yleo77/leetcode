class Solution:
    # @param num, a list of integers
    # @return an integer
    def majorityElement(self, num):
        ret = {}
        for x in num:
            ret[x] = 1 if x not in ret else (ret[x] + 1)

        ret = sorted(ret.items(), key = lambda item:item[1], reverse = True)
        return ret[0][0]


# test
# num = [1, 2, 3, 4, 5, 3, 2, 3, 5, 6]
# solution = Solution()
# ret = solution.majorityElement(num)
# print ret
