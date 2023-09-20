package Medium;

public class ValidSudoku {

	public static void main(String[] args) {
		char[][] board = { {'.','2','.','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','5','.','1'},
				{'.','.','.','.','.','.','8','1','3'},
				{'4','.','9','.','.','.','.','.','.'},
				{'.','.','.','.','.','.','.','.','.'},
				{'.','.','2','.','.','.','.','.','.'},
				{'7','.','6','.','.','.','.','.','.'},
				{'9','.','.','.','.','4','.','.','.'},
				{'.','.','.','.','.','.','.','.','.'} };
		System.out.println(isValidSudoku(board));

	}

	public static boolean isValidSudoku(char[][] board) {
		StringBuilder[] s1 = new StringBuilder[9];
		StringBuilder[] s2 = new StringBuilder[9];
		StringBuilder[] s3 = new StringBuilder[9];
		for (int i = 0; i < 9; i++) {
			s1[i] = new StringBuilder("");
			s2[i] = new StringBuilder("");
			s3[i] = new StringBuilder("");
		}
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] != '.') {
					if (-1 == s1[i].indexOf(String.valueOf(board[i][j]))) {
						s1[i].append(String.valueOf(board[i][j]));
					} else {
						return false;
					}
					if (-1 == s2[j].indexOf(String.valueOf(board[i][j]))) {
						s2[j].append(String.valueOf(board[i][j]));
					} else {
						return false;
					}
					
					if (i == 0 || i == 1 || i == 2) {
						if (j < 3) {
							if (-1 == s3[0].indexOf(String.valueOf(board[i][j])))
								s3[0].append(String.valueOf(board[i][j]));
							else
								return false;
						} else if (j > 2 && j < 6) {
							if (-1 == s3[1].indexOf(String.valueOf(board[i][j])))
								s3[1].append(String.valueOf(board[i][j]));
							else
								return false;
						} else if (j > 5) {
							if (-1 == s3[2].indexOf(String.valueOf(board[i][j])))
								s3[2].append(String.valueOf(board[i][j]));
							else
								return false;
						}
					}
					if (i == 3 || i == 4 || i == 5) {
						if (j < 3) {
							if (-1 == s3[3].indexOf(String.valueOf(board[i][j])))
								s3[3].append(String.valueOf(board[i][j]));
							else
								return false;
						} else if (j > 2 && j < 6) {
							if (-1 == s3[4].indexOf(String.valueOf(board[i][j])))
								s3[4].append(String.valueOf(board[i][j]));
							else
								return false;
						} else if (j > 5 ) {
							if (-1 == s3[5].indexOf(String.valueOf(board[i][j])))
								s3[5].append(String.valueOf(board[i][j]));
							else
								return false;
						}
					}

						if (i == 6 || i == 7 || i == 8) {
							if (j < 3) {
								if (-1 == s3[6].indexOf(String.valueOf(board[i][j])))
									s3[6].append(String.valueOf(board[i][j]));
								else
									return false;
							} else if (j > 2 && j < 6) {
								if (-1 == s3[7].indexOf(String.valueOf(board[i][j])))
									s3[7].append(String.valueOf(board[i][j]));
								else
									return false;
							} else if (j > 5) {
								if (-1 == s3[8].indexOf(String.valueOf(board[i][j])))
									s3[8].append(String.valueOf(board[i][j]));
								else
									return false;
							}
						}
					}
				}
			}
        return true;
	}

}
