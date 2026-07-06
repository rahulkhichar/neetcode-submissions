class Solution {
    public boolean isValidSudoku(char[][] board) {
      

        if(!isRow(board)) return false;

        if(!isCol(board)) return false;

        if(!checkThreeByThree(board)) return false;


        return true;
    }

    public boolean isRow(char[][] board) {

     for(int i = 0 ;i < 9 ; i++){
        boolean []vis = new boolean[10];
        for(int j = 0 ; j < 9 ;j++) {
            if(board[i][j] != '.') {
            int index = (int) (board[i][j] - '0');
            if(vis[index]) return false;
            vis[index] = true;
            }
           
        }
     }
     return true;
    }


    public boolean isCol(char[][] board) {

     for(int i = 0 ;i < 9 ; i++){
        boolean []vis = new boolean[10];
        for(int j = 0 ; j < 9 ;j++) {

         if(board[j][i] != '.') {
            int index = (int) (board[j][i] - '0');
            if(vis[index]) return false;
            vis[index] = true;
            }
        }
     }
     return true;
    }

    public boolean checkThreeByThree(char [][]board) {


        for(int i = 0 ; i< 3 ; i++) {
            for(int j = 0 ;j < 3 ;j++) {

                int startIIndex  = i*3;
                int startJInedx = j*3;

                Set<Character>st = new HashSet<>();

                for(int startI = startIIndex;  startI < startIIndex+3;startI++ ) {
                    for(int startJ = startJInedx ;  startJ < startJInedx + 3; startJ++) {
                       
                        if(board[startI][startJ] != '.') {
                        if(st.contains(board[startI][startJ])) return false;
                        st.add(board[startI][startJ]);
                        }

                    }
                }
            }
        }

        return true;

    }
}
