package Easy;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int search(int[] nums, int target) {
        int len = nums.length;
        if(len == 1 && target == nums[0])
            return 0;
        else if(len == 1 && target != nums[0])
            return -1;
        if(nums[len/2 - 1] == target)
            return len/2 - 1;
        else{
            int left = 0;
            int right = len-1;
            while(left <= right){
                if(nums[right] == target)
                    return right;
                if(nums[left] == target)
                    return left;
                left++;
                right--;
            }
        }
        return -1;
    }

}
