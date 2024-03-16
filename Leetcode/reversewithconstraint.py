class Solution:
    def reverse(self, x : int) -> int:
        
        a = str(x)
        if a[0] == "-":
            l = int(a[0] + a[(len(a)-1):0:-1])
            if l>=2147483647:
                return 0
            elif l<=-2147483648:
                return 0
            else:
                return l
        else:
            l = int(a[::-1])
            if l>=2147483647:
                return 0
            elif l<=-2147483648:
                return 0
            else:
                return l
            
x = 1534236469
s = Solution()
print(s.reverse(x))