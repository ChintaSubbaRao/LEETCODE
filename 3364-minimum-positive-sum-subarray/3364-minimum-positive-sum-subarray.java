class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int  n = nums.size();
        int left = 0;
        int right = 0;

       // int count = 0;
        int min = Integer.MAX_VALUE;

        while(left < n){

            int sum = 0;
            right  = left;

            while(right < n){

                int len = right - left + 1;

                sum += nums.get(right);

                if(len >=l && len <= r){
                    if(sum > 0){
                    min = Math.min(min,sum);
                    }
                }

                
                if(len == r){
                    break;
                }
                right++;

            }
            left++;
        }
    return min == Integer.MAX_VALUE ? -1 : min;
    }
}