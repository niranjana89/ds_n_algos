#selection sort
#select smallest element and replace with the element in the current index and move on.
def selectionSort(a):
    i=0
    while i<len(a)-1:
        min_e=i
        for j in range(i, len(a)):
            if  a[j]<a[min_e]:
                min_e = j
        if a[min_e] < a[i]:
            temp = a[min_e]
            a[min_e] = a[i]
            a[i] = temp
        i = i+1
        print(a)              


a = [1,4,3,5,15,20,3,2,0]
selectionSort(a)
