class Solution {
    public List<List<String>> solveNQueens(int n) {

    List<List<String>> ans = new ArrayList<>();

    char[][] board = new char[n][n];

    for(int i =0;i<n;i++){
        Arrays.fill(board[i],'.');
    }

    solve(0,board,ans);
    return ans;
        
    }
    public void solve(int row,char[][]board,List<List<String>> ans){
            int n = board.length;

    if(row == n){
        
         List<String> temp = new ArrayList<>();

         for(int i = 0;i<n;i++){
            temp.add(new String(board[i]));
         }

         ans.add(temp);
         return;
    }

    for(int col =0;col<n;col++){
          
          if(isSafe(row,col,board)){

            board[row][col]='Q';

            solve(row+1,board,ans);

            board[row][col]='.';
          }

    }
    }

    public boolean isSafe(int rows,int col,char[][] board){

        int n = board.length;
        //upper col

        for(int i = rows-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }

        }
        //upper left dia
        for(int i =rows-1,j=col-1;
         i>=0 &&j>=0;i--,j--){

            if(board[i][j]=='Q'){
                return false;
            }

         }
         //upper right
         for(int i =rows-1,j=col+1;
         i>=0 &&j<n;i--,j++){

            if(board[i][j]=='Q'){
                return false;
            }

         }
         return true;

    }

            

    }
