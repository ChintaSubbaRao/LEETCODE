class Solution {
    public int getLeastFrequentDigit(int n) {
        String s = String.valueOf(n);
        Map<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }


        List<Character> ls = new ArrayList<>(map.keySet());
        Collections.sort(ls);

        int min = Integer.MAX_VALUE;
        int ans = 0;

        for(int i = 0; i < ls.size(); i++){
            if(map.get(ls.get(i)) < min){
                min = map.get(ls.get(i));
                ans = ls.get(i) - '0';
            }
        }
        return ans;
    }
}