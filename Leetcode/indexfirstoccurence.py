class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        n = len(needle)
        parts = []
        for i in range(0,len(haystack),n):
            a = haystack[i:i+n]
            parts.append(a)
        for index,i in enumerate(parts):
            if needle == i:
                a = index*n
                return a
        else:
            return -1
haystack = "Rameshwaram"
needle = "wa"
s = Solution()
print(s.strStr(haystack,needle))


