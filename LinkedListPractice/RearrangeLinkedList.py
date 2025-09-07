class Node: 
	def __init__(self, d): 
		self.data = d 
		self.next = None


class RearrangeLinkedList:   
    def rearrangeEvenOdd(self, head):
        #code here
        
        odd:Node=head
        evenNode:Node=head.next
        dummyevenNode:Node=evenNode
        
        while evenNode and evenNode.next:
            odd.next=evenNode.next
            odd=odd.next
            
            evenNode.next=odd.next
            evenNode=evenNode.next
        
        odd.next=dummyevenNode   # important step to join odd and even linked list
        return head
    
# TC: O(N)
# SC:O(1)   as we are just rearranging the pointers
# 
# 
# There isa nother solution  where SC:O(N) where we can create two linked list one for even and one for odd and then join them.    
    
# head=Node(1)
# head.next=Node(2)
# head.next.next=Node(3)
# head.next.next.next=Node(4)
# head.next.next.next.next=Node(5)
# head.next.next.next.next.next=Node(6)    