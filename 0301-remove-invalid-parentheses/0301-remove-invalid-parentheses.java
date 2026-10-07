class Solution {
    List<String> ans = new ArrayList<>();
    int min = Integer.MAX_VALUE;
    Set<String> set = new HashSet<>();

    public List<String> removeInvalidParentheses(String s) {
        remove(s,0,0);

        return ans;
    }
    void remove(String s,int index,int removed){

        if(isValid(s)){

            if(removed < min){
                min = removed;
                ans.clear();
                set.clear();
            }

            if(removed == min && !set.contains(s)){
                ans.add(s);
                set.add(s);
            }

            return;
        }

        if(removed >= min){
            return;
        }

        for(int i = index; i < s.length(); i++){

            if(s.charAt(i) != '(' && s.charAt(i) != ')'){
                continue;
            }

            if(i > index && s.charAt(i) == s.charAt(i - 1)){
                continue;
            }
    
            String newString = s.substring(0,i) + s.substring(i+1);

            remove(newString,i,removed+1);
        }
    }

    boolean isValid(String s){
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                count++;
            }
            else if(ch == ')'){
                count--;
            }

            if(count < 0){
                return false;
            }
                
        }
    return count  == 0;
    }
}