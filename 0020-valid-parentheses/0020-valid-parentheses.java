class Solution {
    public boolean isValid(String s) {
        boolean ans = true;
        
        if(s.length() == 1) return false;

        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '['||ch == '{'){
                st.push(ch);
            }
            else{
                    if(st.isEmpty()){
                        return false;
                    }
                if(ch == ')' && st.pop() != '('){
                    ans  = false;
                    break;
                }
                else if(ch  == ']' && st.pop() != '['){
                    ans = false;
                    break;
                }
                else if(ch == '}' && st.pop() != '{'){
                    ans = false;
                    break;
                }
            }
        }
        
        if(!st.isEmpty()){
            return false;
        }

        return ans;
    }
}