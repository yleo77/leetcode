class Solution:
    # @param strs, a list of strings
    # @return a list of strings
    def anagrams(self, strs):
        
        dict = {}
        ret = []
        for str in strs:
            newstr = ''.join(sorted(str))

            if newstr not in dict:
                dict[newstr] = [str]
            else:
                dict[newstr].append(str)

        for key in dict:
            if len(dict[key]) >= 2:
                ret += dict[key]
        return ret


