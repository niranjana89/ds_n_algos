#bubble sort
#swap the first largest element to last index, 2nd largest to lastIndex-1 and so on
def bubbleSort(a):
    n= len(a)-1
    for i in range(0, len(a)):
        j=0
        max_e = n
        while j<=n:
            if a[j]>a[max_e]:
                max_e=j
            j = j+1
        if a[max_e]>a[n]:
            temp = a[max_e]
            a[max_e] = a[n]
            a[n] =temp
        n = n-1
        print(a)

a=[3, 5, 1, 7, 8, 2, 20, 35, 8, 32]
bubbleSort(a)
