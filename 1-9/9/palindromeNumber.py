class Solution:
    def isPalindrome(self, x: int) -> bool:
        num_s = str(x)
        if num_s[::-1] == num_s:
            return True
        return False