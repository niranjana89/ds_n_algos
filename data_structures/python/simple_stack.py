#stack Implementation

class Stack():
    def __init__(self):
        self.items =[]
    
    def push(self, item):
        self.items.append(item)
    
    def pop(self):
        return self.items.pop()
    
    def isEmpty(self):
        if len(self.items) == 0:
            return True
        return False

    def peek(self):
        if not self.isEmpty():
            return self.items[len(self.items)-1]
        return None

    
s = Stack()
s.push(5)
s.push(4)
s.push(3)
s.push(2)

print(s.pop())
print(s.peek())

