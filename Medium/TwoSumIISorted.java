package Medium;

public class TwoSumIISorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res[] = twoSum(new int[] {2,7,9,13,15}, 9);
		System.out.println("("+res[0] +", "+res[1]+")");
	}
	  public static int[] twoSum(int[] nums, int target) {
	        int left = 0, right = nums.length - 1;
	        
	        while (nums[left] + nums[right] != target) {
	            if (nums[left] + nums[right] < target) 
	                left++;
	            else 
	                right--;
	        }

	        return new int[] {left + 1, right + 1};
	    }
}
