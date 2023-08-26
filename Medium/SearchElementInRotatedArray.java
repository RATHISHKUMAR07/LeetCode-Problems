package Medium;

public class SearchElementInRotatedArray {

	public static void main(String[] args) {
		int[] arr = {4,5,6,7,0,1,2};
		int target = 7;
		System.out.println(search(arr,target));
	}

	public static int search(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (target == nums[i])
				return i;
		}
		return -1;
	}

}
