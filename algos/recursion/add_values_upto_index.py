#Given an array. adding numbers upto index 0
def addNumbersUptoIndex(a,i):
    if i == len(a):
        return 0
    return a[i] + addNumbersUptoIndex(a,i+1)

a=[1,4,5,3]
result = []
for i in range(0, len(a)):
    result.append(addNumbersUptoIndex(a,i))
print(result)



#Given an array. adding numbers upto index 0
#reverse
def addNumbersUptoIndexReverse(a,n):
    if n<0:
        return 0
    return a[n]+addNumbersUptoIndexReverse(a, n-1)

a=[1,4,5,3]
result = []
for n in range(0,len(a)):
    result.append(addNumbersUptoIndexReverse(a, n))
print(result)
