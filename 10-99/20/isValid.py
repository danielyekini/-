class Solution:
    def isValid(self, s: str) -> bool:
        myDict = {")":"(","}":"{","]":"[",}
        stack = []

        for c in s:
            if c in myDict.values():
                stack.append(c)
            elif len(stack) > 0 and myDict[c] == stack[-1]:
                stack.pop()
            else:
                return False
        
        return len(stack) == 0
        