class Solution(object):
    def findMaxAverage(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: float
        """
        best = now = float(sum(nums[:k]))
        
        for i in range(k,len(nums)):
            now += nums[i] - nums[i - k]
            if(now > best):
                best = now;
                
        return best/k;
        