package Medium;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		int arr[] = {-1,1,0,-3,3};
		arr = productExceptSelf(arr);
		for(int a : arr) {
			System.out.print(a+" ");
		}

	}
	public static int[] productExceptSelf(int[] nums) {
        int total = 1;
        int flag = 0;
        int count = 0;
        for(int var : nums){
            if(var != 0)
                total = total * var;
            if(var == 0){
                flag = 1;
                count++;
            }
        }
        if(count > 1){
            Arrays.fill(nums,0);
            return nums;
        }
        for(int i=0;i<nums.length;i++){
            if(flag == 0){
                if(nums[i] != 0)
                    nums[i] = total / nums[i];
            }
            else{
                if(nums[i] == 0)
                    nums[i] = total;
                else
                    nums[i] = 0;
            }
        }
        return nums;
    }

}
