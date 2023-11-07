package Medium;

public class SurroundedRegionsMatrix {

	public static void main(String[] args) {

		char[][] board = {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
		int row = board.length;
        int col = board[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0 || j==0 || i == col-1 || j == row-1){
                    System.out.println("Hello");
                    continue;
                }
                if(board[i][j] == 'O'){
                    System.out.println("Hello");
                    board[i][j] = 'X';
                    
                }                
            }
        }
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            	System.out.print(board[i][j]);
            }
            System.out.println();
         }

	}
}
