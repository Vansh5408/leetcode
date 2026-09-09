class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans =0;
        int [][]visited = new int [n][m];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1 && visited[i][j]==0){
                    int max =dfs(i,j,grid,visited,n,m);
                    ans = Math.max(ans,max);
                }
            }
        }
        return ans;
    }
    public int dfs(int i ,  int j,int [][]arr, int [][]visited, int n , int m ){
        if(i<0 || j<0 || i>=n || j>=m || arr[i][j]==0 || visited[i][j]==1){
            return 0;
        }
        visited[i][j]=1;
        int a =dfs(i+1,j,arr,visited,n,m);
        int b = dfs(i,j+1,arr,visited,n,m);
        int c = dfs(i-1,j,arr,visited,n,m);
        int d = dfs(i,j-1,arr,visited,n,m);
        return visited[i][j]+a+b+c+d;

    }
}