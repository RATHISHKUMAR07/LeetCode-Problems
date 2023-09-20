package Medium;

import java.util.Arrays;

public class KthSmallestElementSortedMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int kthSmallest(int[][] matrix, int k) {
        int len = matrix[0].length;
        if(len == 1)
            return matrix[0][0];
        int arr[] = new int[len * matrix.length];
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<len;j++){
                arr[count] = matrix[i][j];
                count++;
            }
        }
        Arrays.sort(arr);
        System.out.println(arr);
        return arr[k-1];
    }

}
