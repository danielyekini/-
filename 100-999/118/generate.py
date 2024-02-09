class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        arr = [[1]]
        n = 2
        while n <= numRows:
            arr.append([])
            for i in range(n):
                if i == 0 or i == n-1:
                    arr[n-1].append(1)
                else:
                    prev_line = arr[n-2]
                    arr[n-1].append(prev_line[i]+prev_line[i-1])
            n += 1
        
        return arr