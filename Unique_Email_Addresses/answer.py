

class Solution(object):
    def numUniqueEmails(self, emails):
        ret = set()
        for email in emails:
            local, rest = email.split("@")
            pos = local.find("+")
            if pos >= 0:
                local = local[0: pos]
            local = local.replace(".", "")

            ret.add(local + "@" + rest)
        return len(ret)


emails = ["test.email+alex@leetcode.com",
          "test.e.mail+bob.cathy@leetcode.com",
          "testemail+david@lee.tcode.com"]

sol = Solution()
print(sol.numUniqueEmails(emails))
