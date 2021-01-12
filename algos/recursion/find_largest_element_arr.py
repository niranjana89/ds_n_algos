#find the largest element in an array

def findMaxElement(a, i, max_e):
    if i>=len(a):
        return max_e
    if a[i] > max_e:
        max_e=a[i]
    return findMaxElement(a, i+1, max_e)

a = [1,4,3,5,15,20,3,2,0]
findMaxElement(a,1,a[0])
