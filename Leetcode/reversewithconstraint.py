class Solution:
    def reverse(self, x : int) -> int:
        if x>0:
            x =int((str(x)[::-1]))
            if x>(-1*pow(2,31)) or (x<pow(2,31)):
                return 0
            else:
                return x 
        else:
            x = -1*x
            x =-1*int((str(x)[::-1]))
            if x>=(-1*pow(2,31)) or (x<=pow(2,31)):
              return 0
            else:
              return x 
            

x = -123
s = Solution()
print(s.reverse(x))
        
           

