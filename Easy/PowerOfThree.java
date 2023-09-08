package Easy;

public class PowerOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPowerOfThree(27));
	}
	public static boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0; 
    }
	
//	public boolean isPowerOfThree(int n){
//        if(n<=0)
//            return false;
//        if(n==1)
//            return true;
//        if(n%3!=0)
//            return false;
//        return isPowerOfThree(n/3);
//    }
}
