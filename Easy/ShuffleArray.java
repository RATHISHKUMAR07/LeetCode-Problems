package Easy;

public class ShuffleArray {

	public static void main(String[] args) {
		int[] arr = {2,5,1,3,4,7};
		System.out.println(shuffleArray(arr,3));

	}
	public static int[] shuffleArray(int[] nums, int n) {
	        int a,b;
	        a = 0;
	        b = n;
	        int[] arr = new int[nums.length];
	        for(int i = 0;i<n+n;i=i+2){
	            arr[i] = nums[a];
	            arr[i+1] = nums[b];
	            a++;
	            b++;
	        }
	        return arr;
	    }
}
