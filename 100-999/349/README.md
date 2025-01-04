Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

/**
input:
    - int[] nums1: array of numbers 1
    - int[] nums2: array of numbers 2

output:
    - int[] intersection: array of numbers that appear in both nums1 & nums2

conditions:
    - for each value n in intersections array there is some index i in nums1 and some index j in nums2 that has the same value as n

track:
    - values that have been seen in both nums1 & nums2

example:

nums1 = [9, 0, 4, 7, 2, 6]

nums2 = [5, 8, 3, 2, 1]

intersection(nums1, nums2) = [2]

Algorithm:
    1) Initialize set to store seen numbers
    2) Initialize int array to store numbers that appear in both nums1 & nums2
    3) Iterate over nums1, store each value in set
    4) Iterate over nums2, check each value against the seen values from nums1
        4a) if seen.contains(nums2[j]) intersection.add(nums2[j])
        4b) stop at any point if intersection.length == seen.length
    5) return intersection

    Time Complexity: O(n) + O(m)
    Space Complexity: O(n)
 */

Notes:
This question asks for the presence of a value across two arrays there are no other conditions or details specified. So as position doesn't matter we only need to check the existence of each value of one array in the other array, that is to say, we need to loop over one array and for each value in that array, check if the same value exists in the other array. The algorithm is pretty simple and straight forward we just need the data of the array being checked against to be in an efficiently checkable format so first add the values of nums1 to a hashset for O(1) lookup, that takes a O(n) time complexity. Next loop over nums2 and for each value check if a coresponding value exists in the set. You then need a method to not add the same value to the returned list twice. I chose set.remove() so the same value cannot be checked in again, there are other methods to achieve the same thing but I felt they had other overhead downsides. All in all the iteration over nums2 takes an O(m) time complexity.

There were other solutions to this problem. A solution involving sorting initially came to mind that I wasn't fond of due to the O(nlogn) complexity so I didnt explore it further, I could infer an O(n) solution from the problem breakdown. This sorting solution however uses a lagging two pointer to search through the sorted arrays which I think is a clever use of the two pointer. Unfortiunatley it incurs an O(nlogn+mlogm) complexity for sorting the two arrays.