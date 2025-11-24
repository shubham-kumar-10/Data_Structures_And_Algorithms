from typing import List
def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
    stack=[] # will only pass the index
    result=[0]*len(temperatures)
    n=len(temperatures)
    for idx in range(n-1,-1,-1):
        while stack and temperatures[stack[-1]]<=temperatures[idx]:
            stack.pop()

        if stack:
            result[idx]=abs(stack[-1]-idx)
        stack.append(idx)
    return result

# This problem is the variation of the Next greater Element to the Right Problem.

