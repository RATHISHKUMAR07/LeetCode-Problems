package Hard;
import java.util.*;
public class MedianTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int tot = nums1.length + nums2.length;
        ArrayList<Double> ar = new ArrayList<Double>(); 
        double arr[] = new double[tot];
        int y = 0;
        for(int i=0;i<tot;i++){
            if(i < len1){
                arr[i] = nums1[i];
            }
            else{
                arr[i] = nums2[y];
                y++;
            }
        }
        int x  = 0;
        for(int i=0;i<tot;i++){
            ar.add(arr[i]);
        }
        Collections.sort(ar);
        int t = ar.size();
        double res = 0;
        if(t % 2 == 0){
            res = (double)(ar.get(t/2) + ar.get(t/2 - 1))/2;
        }
        else{
            res = (double)ar.get(t/2);
        }
        return res;
    }
}
