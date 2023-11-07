package Medium;
import java.util.*;
public class TopKFrequentElements {

	public static void main(String args[]) {
		int arr[] = {1,1,2,1,3,3};
		int res[] = topKFrequent(arr, 2);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
	}
	
	public static int[] topKFrequent(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int num: nums) {
            if(num < min)   min = num;
            if(num > max)   max = num;
        }

        int numsRange = max - min + 1;
        int[] counts = new int[numsRange];
        int maxCount = Integer.MIN_VALUE;
        for(int num: nums) {
            int index = num - min;
            counts[index]++;

            if(counts[index] > maxCount)    maxCount = counts[index];
        }

        ArrayList<Integer>[] bucket = new ArrayList[maxCount + 1];
        for(int i = 0; i < numsRange; i++) {
            int num = min + i;
            if(bucket[counts[i]] == null) 
                bucket[counts[i]] = new ArrayList<Integer>();
            bucket[counts[i]].add(num);
        }

        int[] result = new int[k];
        int i = 0;
        int bucketIndex = maxCount;
        while(i < k) {
            List<Integer> curBucket = bucket[bucketIndex];
            if(curBucket != null) {
                for(int bucketNums: curBucket)
                    result[i++] = bucketNums;
            }
            bucketIndex--;
        }
        return result;
    }
}
