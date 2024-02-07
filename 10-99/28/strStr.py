class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        len_h = len(haystack)
        len_n = len(needle)
        for i in range(len_h):
            if haystack[i:len_n+i] == needle: return i
        return -1