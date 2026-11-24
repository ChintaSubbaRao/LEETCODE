class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int max = 0;

        for(int i = 0; i < n; i++){

            int pro = 1;
            int gcdvalue = nums[i];
            int lcmvalue = nums[i];

            for(int j = i; j < n ; j++){

                pro *= nums[j];

                gcdvalue  = lcm(gcdvalue,nums[j]);
                lcmvalue = gcd(lcmvalue,nums[j]);

                if(pro == gcdvalue*lcmvalue){
                    max = Math.max(max,j-i+1);

                }
            }
        }
    return max;
    }

    public int gcd(int a,int b){
        if(b == 0){
            return a;
        }
        return gcd(b,a%b);
    }

    public int lcm(int a,int b){
        int lcm = (a*b)/gcd(a,b);
        return lcm;
    }
}