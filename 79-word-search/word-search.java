class Solution { 
    public boolean exist(char[][] board, String word) {
        if(board.length*board[0].length<word.length()) return false; 
        for(int i=0;i<board.length;i++){ 
            for(int j=0;j<board[0].length;j++){ 
                if(board[i][j]==word.charAt(0)){ 
                    if(ans(board,i,j,word)) return true; 
                } 
            } 
        } 
        return false; 
    } 

    public boolean ans(char[][] board,int i,int j,String word){ 
        
        if(word.length()==0) return true;

        if(i<0 || i>=board.length || j<0 || j>=board[0].length){
            return false;
        }

        if(board[i][j]!=word.charAt(0)){
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '#';

        boolean first = ans(board,i+1,j,word.substring(1));
        boolean second = ans(board,i-1,j,word.substring(1));
        boolean third = ans(board,i,j+1,word.substring(1));
        boolean forth = ans(board,i,j-1,word.substring(1));

        board[i][j] = temp;

        return first || second || third || forth;
    }
}