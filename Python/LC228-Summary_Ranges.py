class Solution(object):
    def summaryRanges(self, nums):
        """
        :type nums: List[int]
        :rtype: List[str]
        """
        result = []
        if len(nums) == 0:
            return result
        elif len(nums) == 1:
            result.append(str(nums[0]))
            return result
            
        start = 0
        for index in range(1,len(nums)):
            if nums[index-1]+1 != nums[index]:
                if start == index-1:
                    result.append(str(nums[start]))
                    start = index
                else:
                    result.append(str(nums[start])+"->"+str(nums[index-1]))
                    start = index
        if start == len(nums)-1:
            result.append(str(nums[start]))
        else:
            result.append(str(nums[start])+"->"+str(nums[len(nums)-1]))
        return result