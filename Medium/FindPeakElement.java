package Medium;

public class FindPeakElement {

	public static void main(String[] args) {
		int[] arr = {1,5,7,3,6};
		System.out.println(findPeakElement(arr));

	}
	 public static int findPeakElement(int[] nums) {
	        int i=0;
	        int j=nums.length - 1;
	        int max = Integer.MIN_VALUE;
	        int pos = 0;
	        while(i<=j){
	            if(nums[i] > max){
	                max = nums[i];
	                pos = i;
	            }
	            if(nums[j] > max){
	                max = nums[j];
	                pos = j;
	            }
	            i++;
	            j--;
	        }
	        return pos;
	    }

}
