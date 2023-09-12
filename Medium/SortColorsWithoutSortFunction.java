package Medium;

public class SortColorsWithoutSortFunction {

	public static void main(String[] args) {
		

	}
	 public void sortColors(int[] nums) {
	        for(int i = 0;i<nums.length;i++){
	            int x = i,y=nums.length-1;
	            while(x <= y){
	                if(nums[i] > nums[x]){
	                    int temp = nums[i];
	                    nums[i] = nums[x];
	                    nums[x] = temp;
	                }
	                if(nums[i] > nums[y]){
	                    int temp = nums[i];
	                    nums[i] = nums[y];
	                    nums[y] = temp;
	                }
	                x++;
	                y--;
	            }
	        }
	    }

}
