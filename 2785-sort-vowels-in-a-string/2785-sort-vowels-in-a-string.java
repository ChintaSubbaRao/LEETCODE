class Solution {
    public String sortVowels(String s) {
        List<Character> list = new ArrayList<>();

        for(char ch : s.toCharArray()){
            if("aeiouAEIOU".indexOf(ch) != -1){
                list.add(ch);
            }
        }

        Collections.sort(list);

        String ans = "";
        int index = 0;

        for(char ch : s.toCharArray()){
            if("aeiouAEIOU".indexOf(ch) != -1){
                ans += list.get(index);
                index++;
            }
            else{
                ans += ch;
            }
        }
    return ans;
    }
}