class Solution {
    public String[] createGrid(int m, int n) {
        String ans[] = new String[m];
        
        char ch[][] = new char[m][n];

        for(int i = 0;i < m; i++){
            for(int j = 0; j < n; j++){
                ch[i][j] = '#';
            }
        }

        for(int i = 0; i < m; i++){
            ch[i][0] = '.';
        }

        for(int j = 0;j < n; j++){
            ch[m - 1][j] = '.';
        }

        for(int i = 0; i < m; i++){
            ans[i] = new String(ch[i]);
        }
    
    return ans;
    }
}