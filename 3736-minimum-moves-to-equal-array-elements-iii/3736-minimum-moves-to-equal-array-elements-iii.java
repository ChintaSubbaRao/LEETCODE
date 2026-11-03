class Solution {
    public int minMoves(int[] nums) {
        
        int n = nums.length;
        // int min = nums[0];

        // for(int i = 0; i < n; i++){
        //    min = Math.min(min,nums[i]);
        // }

        Arrays.sort(nums);

        int max = nums[n-1];

        int sum = 0;

        for(int i = 0; i < n; i++){
            sum += max - nums[i];
        }
    
    return sum;
    }
}