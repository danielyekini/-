class Solution:
    def romanToInt(self, s: str) -> int:
        sum = 0
        numerals = {'I' : 1, 'V' : 5, 'X' : 10, 'L' : 50, 'C' : 100, 'D' : 500, 'M' : 1000}
        numeralSub = {
            'IV' : numerals['V'] - numerals['I'],
            'IX' : numerals['X'] - numerals['I'],
            'XL' : numerals['L'] - numerals['X'],
            'XC' : numerals['C'] - numerals['X'],
            'CD' : numerals['D'] - numerals['C'],
            'CM' : numerals['M'] - numerals['C'],

        }
        i = 0
        while i < len(s):
            if i < len(s) - 1 and s[i:i+2] in numeralSub.keys():
                sum += numeralSub[s[i:i+2]]
                i += 2
                continue
            sum += numerals[s[i]]
            i += 1
        
        return sum