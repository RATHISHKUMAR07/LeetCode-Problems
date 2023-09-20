package Medium;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		int[] height = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));
	}
	public static  int maxArea(int[] height) {
		int i;
		int max = 0;
        int small;
        int prev = 0;
        int j;
		for(i = height.length-1;i>0;i--) {
            if(!(height[i] > prev))
                continue;
            for(j=0;j<i;j++) {
				small = (height[i] > height[j])?height[j]:height[i];
				max = (small * (i - j) > max)?small * (i - j):max;
            }
            prev = height[i];
		}
		return max;
		
		
//		int left = 0;
//        int right = height.length - 1;
//        int max = 0;
//        int area,len;
//        while(left < right){
//            area = right - left;
//            len = (height[left] > height[right]) ? height[right] : height[left];
//            max =(max > area * len) ? max : area * len;
//            if(height[left] > height[right])
//                right--;
//            else if(height[right] > height[left])
//                left++;
//            else{
//                left++;
//                right--;
//            }
//        }
        
    }

}
