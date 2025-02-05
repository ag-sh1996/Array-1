// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List <Integer>  result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        
        int left = 0; int right = n-1;
        int top = 0; int bottom = m-1;

        while(top <= bottom && left <= right)
        {
            //top row
           for(int i = left; i <= right; i++){  
                result.add(matrix[top][i]);
            }
            top++;
            //right wall
            for( int i = top; i <= bottom; i++)
            {
                result.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom){
            //bottom row
                for( int j = right; j >= left ; j--)
             {
                 result.add(matrix[bottom][j]);
             }
             bottom--;
            }
            if(left <= right){
             //left wall
             for( int i = bottom; i >= top; i--)
            {
                result.add(matrix[i][left]);
            }
            left++;
            }
        }

        return result;
    }
}

