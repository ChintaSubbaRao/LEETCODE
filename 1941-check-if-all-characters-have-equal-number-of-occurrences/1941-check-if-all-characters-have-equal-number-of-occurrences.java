class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>(map.values());

        for(int i = 1; i < list.size(); i++){
            if(!list.get(i-1).equals(list.get(i))){
                return false;
            }
        }

        return true;
    }
}