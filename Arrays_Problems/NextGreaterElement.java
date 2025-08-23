package Data_Structures_And_Algorithms.Arrays_Problems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/*
Given an array arr[] of size N having distinct elements, 
the task is to find the next greater element to the right for each element of the array .
 If no such element exists, output -1 for that element.
*/
class NextGreaterElement{
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int[] result=new int[arr.length];
        Arrays.fill(result,-1);
        Stack<Integer> stack=new Stack<>();
        for(int i=arr.length-1;i>=0;i--) {
            while(!stack.isEmpty() && stack.peek()<=arr[i])
              stack.pop();
            if(!stack.isEmpty())
              result[i]=stack.peek();
            stack.push(arr[i]);  
        }
        
        ArrayList<Integer> finalResult=new ArrayList<>();
        for(int num:result){
           finalResult.add(num); 
        }
        return finalResult;
    }
}

// Time complexity: O(N) as we are traversing the entire array once
// Space complexity: O(N) as we are using a stack to store elements

/* CORRESPONDING PYTHON CODE
 *  def nextLargerElement(self, arr: List[int]) -> List[int]:
        result=[-1]*len(arr)
        stack=[]
        for i in range(len(arr)-1,-1,-1):
            while stack and stack[-1]<=arr[i]:
                stack.pop()
            if stack:
                result[i]=stack[-1]
            stack.append(arr[i])
        return result
*/