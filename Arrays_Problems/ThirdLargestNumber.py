import heapq
from typing import List
def thirdDistinctMax(self, nums: List[int]) -> int:
    
    # Thi sapproach is a generalization of finding the kth largest element in an array.
    # First case: To check if there are k distinct numbers 

    unique_list=list(set(nums))

    # use a minHeap of size k:
    minHeap=[]
    k=3
    for num in unique_list:
        heapq.heappush(minHeap,num)
        if len(minHeap)>k:
            heapq.heappop(minHeap)

    # If the size of heap is equal to k, then return minHeap[0]
    #Else return the minHeap[-1] because the problem states that if the third distinct max does not exist, return the maximum number.

    return minHeap[0] if len(minHeap)==k else minHeap[-1]
