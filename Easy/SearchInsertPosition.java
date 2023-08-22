package Easy;

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int searchInsert(int[] nums, int target) {
        int res = 0;
        int i;
        for(i=0;i<nums.length;i++){
            if(nums[i] < target){
                res++;
                continue;
            }
            else{
                break;
            }
        }
        //res = i-1;
        return res;
    }

}
