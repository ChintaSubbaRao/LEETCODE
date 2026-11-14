class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;

        int sum = 0;

        for(int num : nums){
            sum += num;
        }

        int leftsum  = 0;
        int rightsum = sum;

        for(int i = 0; i < n ; i++){
            rightsum -= nums[i];

            if(leftsum == rightsum){
                return i;
            }

            leftsum += nums[i];
        }
    return -1;
    }
}