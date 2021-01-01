#stack Implementation

class Stack():
    def __init__(self):
        self.items =[]
        self.trackMax = []
    
    def push(self, item):
        self.items.append(item)
        if (self.maxElement() != None and self.maxElement() <= item) or self.maxElement()==None:
            self.trackMax.append(item)
       
            
    
    def pop(self):
        k = self.items[len(self.items)-1]
        if k == self.maxElement():
            self.trackMax.pop()
        return self.items.pop()
    
    def isEmpty(self):
        if len(self.items) == 0:
            return True
        return False

    def peek(self):
        if not self.isEmpty():
            return self.items[len(self.items)-1]
        return None
    
    def maxElement(self):
        if len(self.trackMax) ==0:
            return None
        return self.trackMax[len(self.trackMax)-1]
    

    
s = Stack()
s.push(5)
s.push(4)
s.push(3)
s.push(26)
print(s.maxElement())
print(s.pop())
print(s.maxElement())
print(s.peek())
