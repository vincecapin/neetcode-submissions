class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:

        new_list = []

        for i in nums:
            if i not in new_list:
                new_list.append(i)
            else:
                return True
        
        return False
        