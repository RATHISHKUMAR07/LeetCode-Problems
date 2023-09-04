package Medium;

public class SetMatrixZeros {

	public static void main(String[] args) {
		int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
		setZeroes(matrix);
	}
	public static void setZeroes(int[][] matrix) {
		int m= matrix.length, n= matrix[0].length;
        int[][] mat = new int[m][n];
        //Copy to new matrix
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                mat[i][j]=matrix[i][j];
        }
    
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    for(int k=0;k<n;k++)
                        mat[i][k]=0;

                    for(int k=0;k<m;k++)
                        mat[k][j]=0;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                matrix[i][j]=mat[i][j];
        }
    }
}
