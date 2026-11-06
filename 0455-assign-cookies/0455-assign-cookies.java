class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        int  L = 0;
        int  R = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        int m = g.length;
        int n = s.length;

        int count = 0;

        while(L < n && R < m){
            if(g[R] <= s[L]){
                R++;
                //count++;
            }
            L++;
        }
    return R;
    }
}