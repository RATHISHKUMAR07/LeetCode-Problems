package Hard;
import java.util.*;
public class FirstMissigPositive {

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		System.out.println(firstMissingPositive(nums));

	}
	public static int firstMissingPositive(int[] nums) {
        int small = 1;
        Set<Integer> set = new HashSet<>();
        int x = 0;
        int y = nums.length - 1;
        while(x<=y){
            set.add(nums[x]);
            set.add(nums[y]);
            x++;
            y--;
        }
        while(true){
            if(set.contains(small)){
                small++;
                continue;
            }
            break;
        }
        return small;   
    }

}
