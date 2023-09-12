package Medium;

import java.util.*;

public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4,5,6,7},{20,21,22,23,24,25,8},{19,32,33,34,35,26,9},{18,31,30,29,28,27,10},{17,16,15,14,13,12,11}};
		List<Integer> list = spiralOrder(matrix);
		System.out.println(list);
	}
	public static List<Integer> spiralOrder(int[][] matrix) {
		Set<String> set = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		int i = 0;
		int j = 0;
		int right,down=0,left=0,up = 0;
		right = 1;
		int rowLen = matrix[0].length;
		int colLen = matrix.length;
		String s = "";
		while(true) {
			if(colLen * rowLen == list.size())
				break;
			
			while(right == 1) {
				s = "("+i+","+j+")";
				if(!set.contains(s) && j < rowLen) {
					list.add(matrix[i][j]);
					set.add(s);
					j++;
				}
				else{
					right = 0;
					down = 1;
					i++;
					j--;
					break;
				}
			}
			while(down == 1) {
				 s = "("+i+","+j+")";
				if(!set.contains(s) && i < colLen) {
					list.add(matrix[i][j]);
					set.add(s);
					i++;
				}
				else{
					down = 0;
					left = 1;
					j--;
					i--;
					break;
				}
			}
			while(left == 1) {
				 s = "("+i+","+j+")";
				if(!set.contains(s) && j >= 0) {
					list.add(matrix[i][j]);
					set.add(s);
					j--;
				}
				else{
					left = 0;
					up = 1;
					i--;
					j++;
					break;
				}
			}
			while(up == 1) {
				 s = "("+i+","+j+")";
				if(!set.contains(s) && i >= 0) {
					list.add(matrix[i][j]);
					set.add(s);
					i--;
				}
				else {
					up = 0;
					right = 1;
					j++;
					i++;
					break;
				}
			}
		}
		
		return list;
        
    }

}
