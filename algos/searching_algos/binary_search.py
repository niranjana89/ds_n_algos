#binary search
#pre-requisite
#   array must be in sorted order

#complexity O(n/2)
def findByBinarySearch(a, k, left, right):
    #base/terminate condition
    if right< 0 or left > len(a)-1:
        return None
    
    
    #recursive
    mid = (left+right)//2
    print(left, right, mid)
    if a[mid] == k:
        return mid
    elif k > a[mid]:
        left = mid+1
    else:
        right = mid-1
    return findByBinarySearch(a, k, left, right)
    

a = [3,5,6,10,15,21,32]
k = 1
print(findByBinarySearch(a,k, 0, len(a)))
