class Solution(object):
    def runningSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        prefix = [nums[0]]
        
        for i in range(1, len(nums)):
            prefix.append(prefix[i - 1] + nums[i])
            
        return prefix
        
        