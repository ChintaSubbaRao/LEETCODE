class Solution {
    public int minSteps(String s, String t) {
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();

        for(char ch : s.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0) + 1);
        }

        for(char ch : t.toCharArray()){
            map2.put(ch,map2.getOrDefault(ch,0) + 1);
        }

        int count = 0;

        for(char ch : map1.keySet()){
            if(map1.get(ch) == map2.getOrDefault(ch,0)){

                continue;
            }
            else if(map1.get(ch) > map2.getOrDefault(ch,0)){
                count += map1.get(ch) - map2.getOrDefault(ch,0);
            }
        }

        return count;
    }
}