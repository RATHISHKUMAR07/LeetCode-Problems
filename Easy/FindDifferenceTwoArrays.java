package Easy;

import java.util.*;

public class FindDifferenceTwoArrays {

	public static void main(String[] args) {
		int[] n1 = {1,2,3};
		int[] n2 = {2,4,6};
		System.out.println(findDifference(n1, n2));

	}
	public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();
        
        answer.add(diff(nums1,nums2));
        answer.add(diff(nums2,nums1));
        return answer;
    }
    public static List<Integer> diff(int[] n1,int[] n2){
        List<Integer> answer = new ArrayList<>();
        for(int i = 0;i<n1.length;i++){
            int count=0;
            for(int j=0;j<n2.length;j++){
                if(n1[i] != n2[j]){
                    count++;
                }
            }
            if(count == n2.length){
                if(!answer.contains(n1[i]))
                    answer.add(n1[i]); 
            }
        }
        return answer;
    }

}
