package Easy;

public class TwoSum {

	public static void main(String[] args) {
		
	}
	public int[] twoSum(int[] nums, int target) 
    {
        int[] arr = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(i!=j)
                {
                    if(target == nums[i]+nums[j])
                    {
                        arr[0] = i;
                        arr[1] = j;
                    }
                }
            }
        }
        return arr;
    }

}
