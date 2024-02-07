class Solution:

    def addBinary(self, a: str, b: str) -> str:
        def binSum(l):
            sum = 0
            for i, bi in enumerate(l):
                if bi == "1":
                    sum += 2**i
            
            return sum
        binA, binB = list(a[::-1]), list(b[::-1])
        intA, intB = binSum(binA), binSum(binB)
        
        return bin(intA + intB)[2:]

    