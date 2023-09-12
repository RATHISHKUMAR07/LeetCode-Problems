package Easy;
import java.util.*;
public class PointsThatIntersectWithCars {
	public static void main(String[] args) {
		
	}
	 public static int numberOfPoints(List<List<Integer>> nums) {
	        
	        Set<Integer> set = new HashSet<>();
	        for (List<Integer> list : nums) {
	            for(int i = list.get(0);i<= list.get(1);i++){
	                 set.add(i);
	            }
	        }
	        return set.size();
	    }
}
