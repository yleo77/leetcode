class Solution:
    def sortedSquares(self, A):

        B = [i * i for i in A]
        return sorted(B)

sol = Solution()
ary = [-4,-1,0,3,10]
print(sol.sortedSquares(ary))
