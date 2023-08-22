package Easy;

public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void moveZeroes(int[] nums) {
        int len = nums.length;
         for(int i=0;i<len;i++){
            if(nums[i] == 0){
                for(int j=i;j<len;j++){
                    if(nums[j] != 0){
                        int temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                        break;
                    }
                    
                }
            }
        }
    }
}
