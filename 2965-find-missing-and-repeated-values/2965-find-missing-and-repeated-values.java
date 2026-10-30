class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int ans[] = new int[2];

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                map.put(grid[i][j],map.getOrDefault(grid[i][j],0) + 1);
            }
        }

        for(int num : map.keySet()){
            if(map.get(num) == 2){
                ans[0] = num;
            }
        }

        List<Integer> ls = new ArrayList<>(map.keySet());
        Collections.sort(ls);

        if(ls.get(0) != 1){
            ans[1] = 1;
        }

        for(int i = 1; i < ls.size(); i++){
            if(ls.get(i-1)+1 != ls.get(i)){
                ans[1] = ls.get(i-1) + 1;
                break;
            }
        }

        if(ans[1] == 0){
            ans[1] = m*n;
        }
    
    return ans;
    }
}