package Easy;

public class NumberOfOneBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hammingWeight(00000011111100));

	}
	 public static int hammingWeight(int x) {
		 int count = 0;
	        String s = Integer.toBinaryString(x);
	        int len  = s.length();
	        while(len-- > 0) {
	        	if(s.charAt(len) == '1')
	        		count++;
	        }
	        return count;
	   }
}
