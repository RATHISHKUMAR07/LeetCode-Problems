package Medium;

public class JumpGame {

	public static void main(String[] args) {
		int[] nums = { 2, 0, 0 };
		System.out.println(canJump(nums));
	}

	public static boolean canJump(int[] nums) {
		int len = nums.length;
		if (len <= 1) {
			return true;
		}
		int boundary = 0;
		for (int i = 0; i <= boundary; i++) {
			boundary = Math.max(boundary, i + nums[i]);
			if (boundary >= len - 1)
				return true;
		}
		return false;
	}

}
