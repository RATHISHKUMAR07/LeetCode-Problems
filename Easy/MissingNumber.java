package Easy;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public int missingNumber(int[] nums) {
	        int i;
	        int sum = 0;
	        for(i=0;i<nums.length;i++){
	            sum = sum + i;
	            sum = sum - nums[i];
	        }
	        sum = sum + i;
	        return sum;
	   }

}
