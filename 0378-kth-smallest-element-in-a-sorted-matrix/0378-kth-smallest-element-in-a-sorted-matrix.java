class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        int m = matrix.length;
        int n = matrix[0].length;

        int arr[]  = new int[m*n];

        int l = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                 arr[l++] = matrix[i][j];
            }
        }

        Arrays.sort(arr);
        //int ans = -1;

        for(int i = 0; i < arr.length; i++){
            if(k - 1 == i){
                return arr[i];
            }
        }
    return -1;
    }
}