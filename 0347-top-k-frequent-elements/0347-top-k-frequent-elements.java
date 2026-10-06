class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new  HashMap<>();

        for(int n : nums){
            map.put(n,map.getOrDefault(n,0) + 1);
        } 

        ArrayList<Integer> list = new ArrayList<>(map.keySet());

        Collections.sort(list,(a,b) -> map.get(b) - map.get(a));

        int ans[] = new int[k];

        int l = 0,i = 0;
        for(int n: list){
            ans[i] = n;
            i++;
            l++;
            if(l == k){
                break;
            }
        }

        return ans;
    }
}