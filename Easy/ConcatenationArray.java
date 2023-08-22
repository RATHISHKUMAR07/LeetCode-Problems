package Easy;

public class ConcatenationArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int j = 0;
        for(int i = 0;i < 2 * (nums.length);i++){
            ans[i] = nums[j];
            j++;
           if(j == nums.length){
               j = 0;
           } 
        }
        return ans;
    }
}
