class Solution:
    def twoSum(self,nums: list[int], target: int) -> list[int]:
        a=[]
        for index,num1 in enumerate(nums):
            for index2,num2 in enumerate(nums):
                if index!=index2 and num1+num2==target:
                   a.extend([index,index2])
        myset=set(a)
        return list(myset)
        

nums = [3,2,4]
target=6
s1 = Solution()
print(s1.twoSum(nums,target))
