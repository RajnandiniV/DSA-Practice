class Solution {
    public List<List<String>> solveNQueens(int n) {

    List<List<String>> ans = new ArrayList<>();

    char[][] board = new char[n][n];

    for(int i =0;i<n;i++){
        Arrays.fill(board[i],'.');
    }

    int[] left = new int[n];
    int[] lowerdiagonal = new int[2*n-1];
     int[] upperdiagonal = new int[2*n-1];
   

    solve(0,board,ans,left,lowerdiagonal,upperdiagonal);
    return ans;
        
    }
    public void solve(int col,char[][]board,List<List<String>> ans,int[] l,int[] ld,int[] ud){
            int n = board.length;

    if(col == n){
        
         List<String> temp = new ArrayList<>();

         for(int i = 0;i<n;i++){
            temp.add(new String(board[i]));
         }

         ans.add(temp);
         return;
    }

    for(int row =0;row<n;row++){

        if(l[row]==0 && ld[row+col]==0 && ud[n-1+col-row]==0){

            board[row][col]='Q';
            l[row]=1;
            ld[row+col]=1;
            ud[n-1+col-row]=1;

        solve(col+1,board,ans,l,ld,ud);
        board[row][col]='.';

       l[row]=0;
       ld[row+col]=0;
       ud[n-1+col-row]=0;

        }
          
          
    }
    }
}

    