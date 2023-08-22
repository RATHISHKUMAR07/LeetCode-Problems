package Medium;

import java.util.Arrays;

public class SingleNumberII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int singleNumber(int[] nums) {
	        Arrays.sort(nums);
	        if(nums.length == 1)
	            return nums[0];
	        int j = 0,len = nums.length-2;
	        while(j < len){
	            if(nums[j] != nums[j+1])
	                break;
	            j = j+3;
	        }
	        return nums[j];
	    }
}
