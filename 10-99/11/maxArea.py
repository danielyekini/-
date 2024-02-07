class Solution:
    def maxArea(self, height: List[int]) -> int:
        #Two pointer method with each pointer starting at either end of the array
        i = 0
        j = n = len(height)-1
        maxArea = 0

        while n > 0:
            if height[i] < height[j]:
                if height[i] * n > maxArea:
                    maxArea = height[i] * n
                i += 1
                n -= 1
            elif height[j] < height[i]:
                if height[j] * n > maxArea:
                    maxArea = height[j] * n
                j -= 1
                n -= 1
            else:
                print(i, j)
                if height[i] * n > maxArea:
                    maxArea = height[i] * n
                if height[i+1] > height[j-1]:
                    i += 1
                else:
                    j -= 1
                n -= 1


        return maxArea