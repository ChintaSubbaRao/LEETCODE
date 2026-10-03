class Solution {
    public String sortSentence(String s) {
        String ans[] = s.split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < ans.length; i++){
            for(int j = 0; j < ans.length-i-1; j++){
                String f = ans[j];
                String t = ans[j+1];
                if(f.charAt((f.length()-1)) > t.charAt((t.length() - 1)) ){
                    String temp = ans[j];
                    ans[j] = ans[j+1];
                    ans[j+1] = temp;
               }
            }
        }

        for(int i = 0; i < ans.length; i++){
            String sol = ans[i];
            sol = sol.replaceAll("\\d","");

            sb.append(sol);
            sb.append(" ");
        }

        String result = sb.toString();

        result = result.trim();

        return result;
    }
}