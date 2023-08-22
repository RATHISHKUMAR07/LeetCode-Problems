package Easy;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int singleNumber(int[] nums) {
        int result = 0;
        int i,j;
        for(i=0;i<nums.length;i++){
            int flag = 0;
            for(j = 0;j<nums.length;j++){
                if(nums[i] == nums[j] && i != j){
                    flag = 1;
                    break;
                }
            }
            if(j == nums.length && flag == 0)
                return nums[i];
        }
        return result;
    }

}
