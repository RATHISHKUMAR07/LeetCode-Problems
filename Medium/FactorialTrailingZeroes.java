package Medium;

public class FactorialTrailingZeroes {

	public static void main(String[] args) {
		System.out.println(trailingZeroes(13));

	}
	public static int trailingZeroes(int n) {
        if (n < 0)
		    return -1;
	    int output = 0;
        // Count number of 5s in prime factors of n!
	    for (int idx = 5; n/idx >= 1; idx *= 5) {
		    output += n/idx;
	    }
        // Return the number of trailing zeroes...
        return output;
    }

}
