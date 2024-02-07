class Solution:
    def mySqrt(self, x: int) -> int:
        if x == 1: return 1

        lo = 0
        hi = x

        while lo < hi-1:
            
            mid = (lo + hi) // 2
            mid_sq = mid * mid
            
            if mid_sq > x:
                hi = mid
            elif mid_sq < x:
                lo = mid
            else: 
                return mid

        
        return lo