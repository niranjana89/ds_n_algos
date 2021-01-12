#insertion sort
#consider an array with sorted and unsorted list and pick element from unsorted list and place it in the correct
#position in sorted list
def insertionSort(a):
    
    for i in range(1, len(a)):
        j=0
        while j<=i:
            if a[i]<a[j]:
                temp=a[i]
                a[i]=a[j]
                a[j]=temp
            j=j+1
        print(a)

a = [1,4,3,5,15,20,3,2,0]
insertionSort(a)
