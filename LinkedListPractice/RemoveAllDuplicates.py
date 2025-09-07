class Node :
    def __init__(self, val):
        self.data = val
        self.next = None

def removeAllDuplicates(head):
        #code here
        # To remove all occurences pf a node in a linked list
        # Sorted linked list , spo the elements who have same value will be adjacent to each other
        map_dict={}
        
        result=Node(-1)
        dummyResult=result
        
        current=head
        while current:
            curr_data=current.data
            map_dict[curr_data]=map_dict.get(curr_data,0)+1
            
            current=current.next
            
        # Stored the frequencies of all the linked list units into the hashmap
        # Now we can traverse the linked list from the start and check if a particular node has its frequcny as 1 , then only add that to our linked list
        
        while head:
            if map_dict[head.data]==1:
               result.next=Node(head.data)
               result=result.next
            head=head.next   
               
        
        #result.next=None   # good habit
        
        return dummyResult.next


# Test Cases:

#1->2->2->2->3->4          ------------> Output: 1->3->4
#1->1->1->1->1             ------------> Output: None
#1->1->1->2->3->3->4->4->5 ------------> Output: 2->5
#1->2->3->4->5->5->5         ------------> Output: 1->2->3->4