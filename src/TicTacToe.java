public class TicTacToe {
    public static void main(String[] args) {
    }
    public static void ticTacBoard(String[][]boardArray){
        for (int index = 0; index < 3; index++) {
            for (int index1 = 0; index1 < 3; index1++) {
                System.out.println(boardArray[index][index1]);
                if (index1 < 2){
                    System.out.println("  |  ");
                }
            }
            System.out.println();
            if (index < 2){
                System.out.println("________");
            }

        }
    }
    public static void winnerChecker(char[][]board, char player){
        for (int boardRow = 0; boardRow < 3; boardRow++) {
            //if (board[boardRow[0]]==player &&)
        }
    }
}
