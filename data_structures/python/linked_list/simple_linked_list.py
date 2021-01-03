#linked link

class Node():
    def __init__(self, value):
        self.value = value
        self.nextNode = None
        
class linkedList():
    def __init__(self):
        self.head = None
    
    def insert(self, nodeValue):
        n = Node(nodeValue)
        h = self.head
        
        if h == None:
            self.head = n
        else:
            while h.nextNode != None:
                h = h.nextNode
            h.nextNode = n
    

    def deleteFirst(self):
        k = self.head
        if k!=None:
            self.head = k.nextNode
            k = None
        
    def deleteLast(self):
        k = self.head
        if k!= None:
            while k.nextNode!=None:
                k = k.nextNode
            k=None
    
    def traverseList(self):
        k = self.head
        if k!= None:
            print(k.value, end=" -> ")
            while k.nextNode != None:
                k = k.nextNode
                print(k.value, end=" -> " )
    
    
l = linkedList()
l.insert(5)
l.insert(4)
l.insert(3)
l.insert(2)
l.insert(1)

l.traverseList()       
        
        
        
