class TopKFrequentEleements{
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> result=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> minHeap=new PriorityQueue<>((c1,c2)->map.get(c1)-map.get(c2));
        for(int x:map.keySet()){
            minHeap.add(x);
            if(minHeap.size()>k)
                minHeap.remove();
        }

        while(!minHeap.isEmpty()) {
            result.add(minHeap.remove());
        } 
        
        int[] ans=new int[result.size()];
        int i=0;
        for(int num:result){
            ans[i++]=num;
        }
        return ans;
        }
    }

 // Corresponding Python code   

// import heapq
// class Solution:
//     def topKFrequent(self, arr: List[int], k: int) -> List[int]:
//         freq_dict={}
//         for num in arr:
//             freq_dict[num]=freq_dict.get(num,0)+1

//         minHeap=[]
//         for num,freq in freq_dict.items():
//             heapq.heappush(minHeap,(freq,num))
//             if len(minHeap)>k:
//                 heapq.heappop(minHeap)

//         # now I ultimately have a minHeap containing the k elemnts
//         #print(minHeap).  #[[2,2],[3,1]]
        
//         result=[]
//         while minHeap:
//             freq,num=heapq.heappop(minHeap)
//             result.append(num)
//         return result     


// In the same problem, if we have to find the kth distinct element, then in the above python code, 
// we can create a set from the given list and then use the same code as it is.

// new_list=list(set(arr))