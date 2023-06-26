class Solution(object):
    def longestOnes(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        left = right = 0;
        for right in range(len(nums)):
            k -= 1 - nums[right]
            
            if k < 0:
                k += 1 - nums[left]
                left += 1
        return right - left + 1