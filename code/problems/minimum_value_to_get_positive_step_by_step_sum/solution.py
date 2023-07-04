class Solution(object):
    def minStartValue(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        startval = sum = 0
        

        for i in range(len(nums)):
            sum += nums[i]
            startval = min(startval, sum)

        return -startval + 1