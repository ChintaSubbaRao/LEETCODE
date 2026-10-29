class Solution {
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >  max){
                max = nums[i];
                ans = i;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == max){
                continue;
            }

            else if(nums[i]*2 <= max){
                continue;
            }
            else{
                return -1;
            }
        }
    return ans;
    }
}