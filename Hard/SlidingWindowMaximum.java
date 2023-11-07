package Hard;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		int k = 3;
		int[] arr = {1,3,-1,-3,5,3,6,7};
		int[] res = maxSlidingWindow(arr, k);
		for(int a : res) {
			System.out.print(a + " ");
		}

	}
	public static int[] maxSlidingWindow(final int[] in, final int w) {
	    final int[] max_left = new int[in.length];
	    final int[] max_right = new int[in.length];

	    max_left[0] = in[0];
	    max_right[in.length - 1] = in[in.length - 1];

	    for (int i = 1; i < in.length; i++) {
	        max_left[i] = (i % w == 0) ? in[i] : Math.max(max_left[i - 1], in[i]);

	        final int j = in.length - i - 1;
	        max_right[j] = (j % w == 0) ? in[j] : Math.max(max_right[j + 1], in[j]);
	    }

	    final int[] sliding_max = new int[in.length - w + 1];
	    for (int i = 0, j = 0; i + w <= in.length; i++) {
	        sliding_max[j++] = Math.max(max_right[i], max_left[i + w - 1]);
	   }
	  return sliding_max;
	}
}

//	    public int[] maxSlidingWindow(int[] nums, int k) {
//	        int len = nums.length;        
//	        int resLen = nums.length - k + 1;
//	        int[] arr = new int[resLen];
//	        for(int i=0;i<resLen;i++){
//	            arr[i] = (findMax(i,i+k-1,nums));
//	        }       
//	        System.out.print(len+ " "+resLen); 
//	        return arr;
//	    }
//	    public int findMax(int start,int end,int[] nums){
//	        int max = Integer.MIN_VALUE;
//	        while(start<=end){
//	            max = (max < nums[start])?nums[start]:max;
//	            max = (max < nums[end])?nums[end]:max;
//	            start++;
//	            end--;
//	        }
//	        return max;
//	    }
	

