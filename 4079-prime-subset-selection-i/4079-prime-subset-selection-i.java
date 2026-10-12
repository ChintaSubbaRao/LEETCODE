class Solution {
    public List<Integer> maxPrimes(int n, int s) {

        Boolean prime[] = new Boolean[n+1];
        Arrays.fill(prime,true);

        prime[0] = false;
        if(n >= 1){
            prime[0] = false;
        }
        for(int i = 2; i*i<= n; i++){
            if(prime[i]){
                for(int j = i*i; j <= n; j+=i){
                    prime[j] = false;
                }
            }
        }
        int sum = 0;
        List<Integer> ans = new ArrayList<>();

        for(int i = 2; i <= n; i++){
            if(prime[i]){
                int sol = sum + i;
                if(sol <= s){
                    sum += i;
                    ans.add(i);
                }
                else{
                break;
                }
            }
        }
        return ans;
    }
}