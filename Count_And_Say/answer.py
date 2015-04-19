class Solution:
    # @param n, an integer
    # @return a string
    def countAndSay(self, n):
        ret = '1'
        for i in range(1, n):
            char = ret[0]
            num = 1
            current = ""
            for j in range(1, len(ret)):
                if char == ret[j]:
                    num = num + 1
                else:
                    current += str(num) + char
                    char = ret[j]
                    num = 1
            current += str(num) + char
            ret = current
        return ret

# test
solution = Solution()
for i in range(1, 8):
    print solution.countAndSay(i)
