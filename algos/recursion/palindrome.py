#palindrome
def isPalindrome(k,i,n):
    if i>=(len(k)//2) and n<= (len(k)//2):
        return True
    if k[i]!=k[n]:
        return False
    return isPalindrome(k,i+1,n-1)


k = "madam"
isPalindrome(k,0,len(k)-1)
