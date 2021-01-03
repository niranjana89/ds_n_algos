#This problem was asked by Google.

#You are given an array of nonnegative integers. Let's say you start at the beginning of the array and are trying to advance to the end. 
#You can advance at most, the number of steps that you're currently on. Determine whether you can get to the end of the array.

#For example, given the array [1, 3, 1, 2, 0, 1], we can go from indices 0 -> 1 -> 3 -> 5, so return true.

#Given the array [1, 2, 1, 0, 0], we can't reach the end, so return false.



def checkPathCompleteness(a, i):
    if i == len(a)-1:
        return True
    elif i > len(a)-1:
        return False
    elif i<len(a)-1 and a[i]==0:
        return False
    for k in range(i+1, i+a[i]+1):
        if(checkPathCompleteness(a, k)):
            return True
    return False  


#a = [1,3,1,2,0,1]
a = [1, 2, 1, 0, 0]
print(checkPathCompleteness(a, 0))


