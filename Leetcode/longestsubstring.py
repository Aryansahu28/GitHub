class Solution:
    def lengthOfLongestSubstring(self,s : str) ->int:
        a = []
        for i in range(0,len(s)):
            a.append(s[i])
        a.remove(a[0])
        a = set(a)
        return (a.__len__())

s = "abcabcbb"

s1 = Solution()
print(s1.lengthOfLongestSubstring(s))
