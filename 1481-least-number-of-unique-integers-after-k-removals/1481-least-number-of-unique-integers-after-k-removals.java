class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> map =  new HashMap<>();

        for(int n : arr){
            map.put(n, map.getOrDefault(n,0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.keySet());

        Collections.sort(list,(a,b) -> {
            return map.get(a) - map.get(b);
        });
        
        int j = 0;
        for(int i = 0; i < list.size(); i++){
           int freq = map.get(list.get(i));

           if(k >= freq){
            k -= freq;
            map.remove(list.get(i));
           }
           else{
            map.put(list.get(i),freq-k);
           // k = 0;
            break;
           }
        }

        return map.size();
    }
}