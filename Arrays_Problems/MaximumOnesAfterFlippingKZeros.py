def maximumOnesAfterFlippingKZeros(arr:list[int],k:int)->int:
    #Brute fiorce technique:
    # n=len(arr)
    # max_ones=0
    # for i in range(n):
    #     zero_count=0
    #     for j in range(i,n):
    #         if arr[j]==0:
    #             zero_count+=1
    #             if zero_count>k:
    #                 break
    #         max_ones=max(max_ones,j-i+1)
    # return max_ones

    # Optimized approach: We can use sliding window technique to solve the problem.
    n=len(arr)
    start=0
    max_ones=0
    zero_count=0
    end=0
    while end<n:
        if arr[end]==0:
            zero_count+=1
            while zero_count>k:  # will decrement the window size and also check if element at start is zero or not. Accordingly manage the zero_count as well
                if arr[start]==0:
                    zero_count-=1
                start+=1        
        max_ones=max(max_ones,end-start+1)
        end+=1
    return max_ones

print(maximumOnesAfterFlippingKZeros([1,0,0,1,1,0,1],2))  # Expected output: 5
print(maximumOnesAfterFlippingKZeros([1,0,0,1,0,1,0,1,0,1,1],2))  # Expected output: 6


    


            