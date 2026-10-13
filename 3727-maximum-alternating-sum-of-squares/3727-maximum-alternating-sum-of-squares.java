class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;

        int ans[] = new int[n];
        for(int i = 0; i < n; i++){
            ans[i] = nums[i]*nums[i];
        }

        Arrays.sort(ans);

        long sol = 0;

        for(int i = 0 ; i < n/2 ; i++){
            sol -= ans[i];
        }

        for(int i = n/2; i < n; i++){
            sol += ans[i];
        }

    return sol;
    }
}