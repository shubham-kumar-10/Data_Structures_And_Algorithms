import java.util.PriorityQueue;
class kthLargestSmallest {
    // Function to find the kth largest element in an array
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap=new PriorityQueue<>((c1,c2)->{
            return c1-c2;
        });

        for(int num:nums) {
          minHeap.add(num);
          if(minHeap.size()>k)
           minHeap.remove();
        }
        return minHeap.peek(); // removes the smallest of k elemnts present in the minHeap
    }
        

    // Function to find the kth smallest element in an array
    public static int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>((c1,c2)->{
            return c2-c1;
        });

        for(int num:nums) {
          maxHeap.add(num);
          if(minHeap.size()>k)
           maxHeap.remove();
        }
        return maxHeap.peek(); 
    }
}