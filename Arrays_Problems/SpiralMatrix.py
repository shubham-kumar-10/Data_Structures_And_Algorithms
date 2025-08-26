def spiral_matrix(matrix):
    if not matrix:
        return []

    result = []
    top, bottom = 0, len(matrix) - 1
    left, right = 0, len(matrix[0]) - 1

    while top <= bottom and left <= right:
        # Traverse from left to right
        for i in range(left, right + 1):
            result.append(matrix[top][i])
        top += 1

        # Traverse from top to bottom
        for i in range(top, bottom + 1):
            result.append(matrix[i][right])
        right -= 1

        if top <= bottom:
            # Traverse from right to left
            for i in range(right, left - 1, -1):
                result.append(matrix[bottom][i])
            bottom -= 1

        if left <= right:
            # Traverse from bottom to top
            for i in range(bottom, top - 1, -1):
                result.append(matrix[i][left])
            left += 1

    return result

if __name__ == "__main__":
    #Tale user input
    row,col=map(int,input().split())   # 1st row taking input for rows and columns
    matrix=[list(map(int,input().split())) for _ in range(row)]
    print(spiral_matrix(matrix))

    #TC: O(m*n) where m is number of rows and n is number of columns as we are visiting each cell once
    #SC: O(m*n) for storing the result in a list