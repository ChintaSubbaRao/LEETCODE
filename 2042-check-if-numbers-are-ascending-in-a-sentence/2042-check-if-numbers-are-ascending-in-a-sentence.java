class Solution {
    public boolean areNumbersAscending(String s) {
        ArrayList<Integer> ls = new ArrayList<>();

        String num = "";

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                num += ch;
            }
            else{
                if(!num.isEmpty()){
                    ls.add(Integer.parseInt(num));
                    num = "";
                }
            }    
        }

        if(!num.isEmpty()){
            ls.add(Integer.parseInt(num));
                    num = "";
        }

        //int ans = ls.get[0];

        for(int i = 0; i < ls.size() - 1; i++){
            if(ls.get(i+1)  <= ls.get(i)){
                return false;
            }
        }
    return true;
    }
}