class Solution:
    def uniqueMorseRepresentations(self, words) -> int:
        CODES = [".-", "-...", "-.-.", "-..", ".", "..-.",
                 "--.", "....", "..", ".---", "-.-", ".-..",
                 "--", "-.", "---", ".--.", "--.-", ".-.", "...",
                 "-", "..-", "...-", ".--", "-..-", "-.--", "--.."]
        collection = []
        for word in words:
            code = ""
            for char in word:
                code = code + CODES[ord(char) - ord("a")]
            collection.append(code)

        return len(set(collection))

sol = Solution()
stary = ["gin", "zen", "gig", "msg"]

print(sol.uniqueMorseRepresentations(stary))
