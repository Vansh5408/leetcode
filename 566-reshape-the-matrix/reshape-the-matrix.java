class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length;
        int m =mat[0].length;
        if(n==r && c==m) return mat;
        if(n*m !=r*c) return mat;
        int [][]ans = new int [r][c];
        int a =0;
        int b=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(b<mat[0].length){
                    ans[i][j]=mat[a][b];
                    b++;
                }
                else{
                    a+=1;
                    b=0;
                    j--;
                }
            }
        }
        return ans;
    }
}