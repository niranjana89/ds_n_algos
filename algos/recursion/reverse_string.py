#REcursion - reverse a string
def reverseString(message, l, r):
    #base condition
    if len(message)==1:
        return message
    elif len(message)==2:
        return message[r]+message[l]
    
    #logic
    mid = message[l+1:r]
    print(mid)
    
    #recursive condition
    return message[r]+ reverseString(mid,0,len(mid)-1)+message[l]



message = "123456"
print(reverseString(message, 0, len(message)-1))
