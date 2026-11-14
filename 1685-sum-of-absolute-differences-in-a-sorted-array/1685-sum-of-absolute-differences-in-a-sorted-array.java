class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
        }
        int leftsum = 0;

        for(int i = 0; i < n; i++){
            int left = (i*nums[i]) - leftsum;

            int right = (sum - leftsum - nums[i]) - ((n - i - 1)*nums[i]);
            
            res[i] = left + right;
            
            leftsum += nums[i];
        }

    return res;
    }
}