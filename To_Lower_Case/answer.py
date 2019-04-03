
class Solution:

    def toLowerCase(self, str: str) -> str:

        rs = ""
        # 32
        section = ord("a") - ord("A")
        for s in str:
            if ord(s) >= ord("A") and ord(s) <= ord("Z"):
                rs = rs + chr(ord(s) + section)
            else:
                rs = rs + s
        return rs

sol = Solution()
print(sol.toLowerCase("Hello"))
