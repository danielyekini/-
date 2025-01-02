You are given a 0-indexed integer array nums and a target element target.

A target index is an index i such that nums[i] == target.

Return a list of the target indices of nums after sorting nums in non-decreasing order. If there are no target indices, return an empty list. The returned list must be sorted in increasing order.

/**
input:
    - nums: int[]
    - target: int

output:
    - List<Integer>: of the target indices of nums after sorting nums in non-decreasing order.

conditions:
    - nums must be sorted in increasing order
    - target indicies are where the value at that index equals target

example:

nums = [4, 2, 0, 2, 1]
target = 2

sorted nums = [0, 1, 2, 2, 4]
output = [2, 3]

Naive:
    1) sort nums O(nlogn)
    2) linear search through array to find target indicies O(n)
    3) add matching indicies to list
    4) return list of target indicies

    Time complexity: O(nlogn) + O(n)


Optimised:
    1) sort nums O(nlogn)
    2) binary search through array to find target indicies O(logn)
    3) once target found iterate pointers outward on either side till left pointer no longer equals target and right pointer no longer equals target or is out of bounds
    4) return list of target indicies

 */

Notes:

This is a search problem to return the indicies in an array that equal some target value after sorting the array in non-decreasing order. The intuitive approach would be a linear search (O(n)) through the sorted array while updating a list with indicies that meet the specified conditions, in this case, the value at that index == target. It's quickly apparent the target value is likley not the largest or smallest in the array and as an effect the target indicies are positioned with more values on either side. Due to this there is the obvious optimisation of stopping the search once the target value has been found and another non-target value is found as all target indicies at this point have been added to the list. While this will provide in most cases a better time complexity than O(n) the average time complexity of this part of the algorithm remains O(n) and the overall complexity O(nlogn). I considered an optimisation in the search to perform a binary search through the array and then to iterate two pointers on either side of the target value outward until they reach a non-target value, taking that range of indicies as the target indicies. However I felt the implementation complexity of this appraoch was not worth the O(n) - O(logn) time saved, especially considering the constraints of the input size (1 <= nums.length <= 100). So for this particualr case I was happy with the naive algorithm.

The optimal solution for this problem however, involves counting the number of integers in the list that are less than the target value while counting the number of times the target value appears in the list. You are then able to discern at which index in the sorted array the target value first appears and how many indicies it appears for. This approach gives an O(n) time complexity rather than the O(nlogn) sorting from my appraoch. In my thinking I was trying to determin how to get a range and was quite stuck in my idea of using pointers I failed to see this simple apprach of using counters.

