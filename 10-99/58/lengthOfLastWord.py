class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        words = s.split(" ")
        lastWord = words[-1]
        i = -2
        while lastWord == "":
            lastWord = words[i]
            i -= 1

        return len(lastWord)
    

# class Solution:

#     lengthOfLastWord = lambda self, s : len(s.strip().split(" ")[-1])