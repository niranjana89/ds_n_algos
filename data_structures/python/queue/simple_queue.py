
#queue

class queue():
    def __init__(self):
        self.items = []
    
    def enqueue(self, item):
        self.items.append(item)
        
    def dequeue(self):
        if not self.isEmpty():
            self.items.pop(0)
    
    def isEmpty(self):
        if len(self.items)==0:
            return True
        return False
    
    def peek(self):
        if not self.isEmpty():
            return self.items[len(self.items)-1]
        return None
        

q = queue()
q.enqueue(5)
q.enqueue(15)
q.enqueue(25)

print(q.peek())
q.dequeue()
q.dequeue()
print(q.peek())
q.dequeue()
q.dequeue()
print(q.peek())
