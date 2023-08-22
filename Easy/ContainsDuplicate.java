package Easy;
import java.util.*;
public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set= new HashSet<Integer>();
        for(int x :nums){
            if(set.contains(x)) 
                return true;
            set.add(x);
        }
        return false;
    }

}
