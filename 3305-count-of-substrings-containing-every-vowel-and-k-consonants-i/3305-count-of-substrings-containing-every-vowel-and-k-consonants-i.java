class Solution {
    public int countOfSubstrings(String word, int k) {
        int n = word.length();
        int count = 0;

        for(int i = 0; i < n; i++){
            Map<Character,Integer> map = new HashMap<>();
            int con = 0;
            for(int j = i; j < n; j++){
                char ch = word.charAt(j);
                if("aeiou".indexOf(ch) != -1){
                    map.put(ch,map.getOrDefault(ch,0) + 1);
                }
                else{
                    con++;
                }

                 if(map.size() == 5 && con == k){
                    count++;
                }       
            }
        }
    return count;
    }
}