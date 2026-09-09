class Solution {
    public int numIslands(char[][] grid) {
        int n =grid.length;
        int m = grid[0].length;
        boolean [][]visited = new boolean [n][m];
        for(boolean []arr:visited) Arrays.fill(arr,false);
        int ans =0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1' && visited[i][j]==false){
                    dfs(i,j,grid,visited,n,m);
                    ans++;
                }
            }
        }
        return ans;
    }
    public void dfs(int i ,int j,char[][]arr, boolean[][]visited,int n , int m){
        if(i<0 || j<0 || i>=n || j>=m || arr[i][j]=='0' || visited[i][j]==true){
            return;
        }
        visited[i][j]=true;
        dfs(i+1,j,arr,visited,n,m);
        dfs(i-1,j,arr,visited,n,m);
        dfs(i,j+1,arr,visited,n,m);
        dfs(i,j-1,arr,visited,n,m);
    }
}