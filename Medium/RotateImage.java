package Medium;

public class RotateImage {

	public static void main(String[] args) {
		
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int n = matrix.length;
        
        //Column Reverse
        for(int i = 0; i < n; i++){
            int a = 0;
            int b = n-1;
            while(a <= b){
               int temp = matrix[a][i];
                matrix[a][i] = matrix[b][i];
                 matrix[b][i] = temp;
                 a++;
                 b--;
            }
        }
        //Transpose
        for(int i = 0; i < n; i++){
            for(int j =i+1; j< n; j++){
                int temp =  matrix[i][j];
                 matrix[i][j] =  matrix[j][i];;
                 matrix[j][i] = temp;
            }
        }
        for(int x=0;x<matrix.length;x++) {
        	for(int y=0;y<matrix[0].length;y++) {
        		System.out.print(matrix[x][y]+ " ");
        	}
        System.out.println();
        }

	}

}
