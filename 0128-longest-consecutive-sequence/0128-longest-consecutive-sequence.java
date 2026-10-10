class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int n : nums){
            set.add(n);
        }

        List<Integer> ls = new ArrayList<>(set); 
        Collections.sort(ls);

        int count = 1;
        int max = 0;

        for(int i = 0; i < ls.size() - 1; i++){
            if(ls.get(i)+1 == ls.get(i+1)){
                count++;
            }
            else{
                count = 1;
            }
        max = Math.max(max,count);
        }
    if(ls.isEmpty()){
        return 0;
    }

    if(max == 0){
     return 1;   
    }

    return max;
    }
}