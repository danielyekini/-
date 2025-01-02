Given a 0-indexed integer array nums of length n and an integer target, return the number of pairs (i, j) where 0 <= i < j < n and nums[i] + nums[j] < target.

/**
Input:
    - nums: integer array
    - target: integer

Output:
    - no. of pairs: integer

Conditions:
    - 0 <= index < jndex < length
    - nums[index] + nums[jndex] < target

Example:

nums = [2, 0, 8, 4, 3, 1]

target = 5

Naive Algo:
    Brute Force (Two Pointer):
        1) 

 */

The idea here was to brute force the search and check every pair in the array that satisfies the condition. I used a fast slow pointer approach  with a O(n^2) time complexity and an O(1) space complexity