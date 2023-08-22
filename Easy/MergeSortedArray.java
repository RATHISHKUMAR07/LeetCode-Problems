package Easy;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void merge(int[] nums1, int m, int[] nums2, int n) {
	       
        for(int i=0;i<m+n;i++){
            if(i >= m){
                nums1[i] = nums2[i-m];
            }
        }
        Arrays.sort(nums1);
        System.out.print(Arrays.toString(nums1));

    }
}
