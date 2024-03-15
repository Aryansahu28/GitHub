class Solution:
    def findMedianSortedArrays(self, num1: list[int], num2: list[int]) ->float:
        num = []
        for i in range(0,len(num1)):
            num.append(num1[i])
        for j in range(0,len(num2)):
            num.append(num2[j])
        num = sorted(num)

        k = len(num)
        if k%2==0:
            median = "{median_calc:.5f}"
            return float(median.format(median_calc=((num[(int(k/2))-1]+num[(int(k/2 + 1))-1])/2)))

        else:
            median = "{median_calc:.5f}"
            return float(median.format(median_calc=num[(int((k+1)/2))-1]))
        
num1 = [1,3]
num2 = [2]
s = Solution()
print(s.findMedianSortedArrays(num1,num2))


# a = [1,3]
# b = [2]

# c=[]
# for i in range(0,len(a)):
#     c.append(a[i])

# for j in range(0,len(b)):
#     c.append(b[j])



