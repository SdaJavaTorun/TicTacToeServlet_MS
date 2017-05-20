package pl.sdaacademy.model;

public class TicTacToe {
    // 0 - pole puste
    // 1 - kółko
    // 2 - krzyżyk

    private int[][] board = {{0,0,0},{0,0,0},{0,0,0}};

    private int currentPlayer = 1;

    private boolean isFieldEmpty(int x, int y){
        if (board[x][y] == 0);
        return true;
    }

    public int getField(int x, int y){
        return board[x][y];
    }

    private void togglePlayer(){
        if(currentPlayer == 1) {
            currentPlayer = 2;
        } else {currentPlayer = 1;
        }
    }

    public boolean setField(int x, int y){
        if (isFieldEmpty(x,y)) {
            board[x][y] = currentPlayer;
            togglePlayer();
        }
            return true;
    }

    public boolean isXWinner(){
        return isWinner(2);
    }
    public boolean isOWinner(){
        return isWinner(1);
    }

    public boolean isWinner(int player){
        return (board[0][0] == player && board[0][1] == player && board[0][2] == player) ||
        (board[1][0] == player && board[1][1] == player && board[1][2] == player) ||
        (board[2][0] == player && board[2][1] == player && board[2][2] == player) ||
        (board[0][0] == player && board[1][0] == player && board[2][0] == player) ||
        (board[0][1] == player && board[1][1] == player && board[2][1] == player) ||
        (board[0][2] == player && board[1][2] == player && board[2][2] == player) ||
        (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
        (board[2][0] == player && board[1][1] == player && board[0][2] == player);
    }


}
