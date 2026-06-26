class Solution {
    public boolean exist(char[][] board, String word) {

        int m = board.length; //roes
        int n = board[0].length;//col

        for(int i =0;i<m;i++){ //trying to find starting word
            for(int j =0;j<n;j++){
                if(dfs(i,j,word,board,0)){//if word found
                       return true;

            }
        }
        }
        //not found
     return false;
    }
    public boolean dfs(int row,int col,String word,char[][] board,int idx){
        
        //all letters matched
        if(idx==word.length()){
            return true;
        }
       //idx out of bounds
        if(row<0 || row>=board.length || col<0 || col>=board[0].length){
            return false;
        }
         
         //mismatch
        if(board[row][col]!=word.charAt(idx)){
            return false;
        }
         //save org letter
        char temp=board[row][col];
        board[row][col]='#'; //mark vistited


        boolean found= dfs(row+1,col,word,board,idx+1)|| //down
                         dfs(row-1,col,word,board,idx+1)|| //up
                         dfs(row,col+1,word,board,idx+1)||
                         dfs(row,col-1,word,board,idx+1);

        board[row][col]=temp; //restore,backtrack

      return found;

      //t.c O(m × n × 3^k) SC = O(k) k = word.length()
    }

}