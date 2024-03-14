class Solution:
    def isPalindrome(self,x : int) -> bool:
        x = str(x)
        num = x[::-1]
        if num == x:
            return True
        else:
            return False
        

x = 1213

s = Solution()
print(s.isPalindrome(x))
