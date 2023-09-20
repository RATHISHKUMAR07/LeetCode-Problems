package Medium;

public class MaximumSubarray {

	public static void main(String[] args) {
		int arr[] = { 5, 4, -1, 7, 8 };
		System.out.println(maxSubArray(arr));

	}

	public static int maxSubArray(int[] nums) {
		int n = nums.length;
		int max = Integer.MIN_VALUE, sum = 0;

		for (int i = 0; i < n; i++) {
			sum += nums[i];
			max = (sum > max) ? sum : max;

			if (sum < 0)
				sum = 0;
		}

		return max;

	}
}

//while(x<y){
//sub = sum - sub1 - sub2;
//if(max < sub){
//  max = sub;
//}
//if(nums[x] > nums[y]){
//  sub1 = sub1 + nums[y];
//  y--;
//
//}
//else if(nums[y] > nums[x]){
//  sub2 = sub2 + nums[x];
//  x++;
//}
//else{
//  y--;
//}
//}
