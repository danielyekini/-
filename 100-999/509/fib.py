class Solution:
    def fib(self, n: int) -> int:
        a = 0
        b = 1
        
        if n == 0:
            return n
        elif n == 1:
            return 1
        else:
            for i in range(1, n):
                c = a + b
                a = b
                b = c
            return b