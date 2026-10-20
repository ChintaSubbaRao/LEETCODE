class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();

        for(String word : strs){
            char ans[] = word.toCharArray();
            Arrays.sort(ans);

            String key = new String(ans);
            
            List<String> group = map.getOrDefault(key,new ArrayList<>());

            group.add(word);
            map.put(key,group);

        }
    
    return new ArrayList<>(map.values());
    }
}