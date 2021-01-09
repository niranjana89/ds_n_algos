#searching algorithms
#linear search

#complexity is O(n)
def findByLinearSearch(a, k):
    for i in a:
        if k==i:
            return True
    return False



a = [3,10,40,50,5,7,9,18]
k = 25
print(findByLinearSearch(a,k))
