class Solution {
    int newX;
    int newY;
    int[] dx = {-1, 1, 0 ,0};
    int[] dy = {0, 0, -1 ,1};
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] != '0'){
                    count++;
                    dfs(i, j, grid);
                }
            }
        }
        return count;
    }
    void dfs(int i, int j, char[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        grid[i][j] = '0';
        for(int d = 0; d < 4; d++){
            newX = i + dx[d];
            newY = j + dy[d];
            if(newX >= 0 && newY >= 0 && newX < n && newY < m && (grid[newX][newY] != '0')){
                dfs(newX, newY, grid);
            }
        }
        
    }
}