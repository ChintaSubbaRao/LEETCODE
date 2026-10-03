class Solution {
    public String reverseParentheses(String s) {
        
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch != ')'){
                st.push(ch);
            }
            else{
                String temp = "";
                while(st.peek() != '('){
                    temp += st.pop();
                }
                st.pop();
                for(char c : temp.toCharArray()){
                    st.push(c);
                }
            }
        }

        String ans = "";

        while(!st.isEmpty()){
            ans = st.pop()+ans;
        }

        return ans;
    }
}