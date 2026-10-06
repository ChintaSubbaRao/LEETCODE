class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer> map = new HashMap<>();
        for(String ch : arr){
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }

        int i = 0;
        for(String ch : arr){
            if(map.get(ch) == 1){
                i++;
            }
            if(i == k){
                return ch;
            }
        }

        return "";
    }
}