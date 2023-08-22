package Medium;

public class Search2dMatrixII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean searchMatrix(int[][] matrix, int target) {
        int flag = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int arr[] = new int[row*col];
        int x = 0;
        // if(target == 0)
        //     return false;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<col;j++){
                arr[x] = matrix[i][j];
                x++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                flag = 1;
            }
        }
        if(flag == 0)
            return false;
        return true;
        
    }

}
