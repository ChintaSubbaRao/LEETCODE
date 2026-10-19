class Solution {
    public String sortVowels(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(ch == 'a'||ch == 'e'|| ch == 'i'|| ch == 'o'||ch == 'u'){
            map.put(ch,map.getOrDefault(ch,0) + 1);
            }
        }

        List<Character> ls = new ArrayList<>(map.keySet());

        List<Character> ans = new ArrayList<>();

        for(char ch : ls){
            for(int i = 0;  i < map.get(ch); i++){
                ans.add(ch);
            }
        }

        Collections.sort(ans,(a,b) ->{
            if(!map.get(a).equals(map.get(b))){
                return map.get(b) - map.get(a);
            }
            else{
                return s.indexOf(a) - s.indexOf(b);
            }
        });

        String res = "";
        int index = 0;

        for(char ch : s.toCharArray()){
            if(ch == 'a'||ch == 'e'|| ch == 'i'|| ch == 'o'||ch == 'u'){
                res += ans.get(index);
                index++;
            }
            else{
                res += ch;
            }
        }
    return res;
    }
}