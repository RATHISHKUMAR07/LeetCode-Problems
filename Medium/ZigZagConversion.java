package Medium;

public class ZigZagConversion {

	public static void main(String[] args) {
		System.out.println(convert("PAYPALISHIRING", 4));
	}
	public static String convert(String s, int numRows) {
		int[] arr = new int[s.length()];
		if (numRows == 1)
			return s;

		int zig = 0;
		int flag = 1;
		
		StringBuilder[] sb = new StringBuilder[numRows];
		for (int x = 0; x < sb.length; x++) sb[x] = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			if (flag == 1) {
				sb[zig].append(s.charAt(i));
				if (zig == numRows-1) {
					flag = 0;
					zig--;
				} 
				else {
					flag = 1;
					zig++;
				}
			} 
			else {
				sb[zig].append(s.charAt(i));
				if (zig == 0) {
					flag = 1;
					zig++;
				} 
				else {
					flag = 0;
					zig--;
				}
			}
		}
		for(int i=1;i<numRows;i++){
		    sb[0].append(sb[i]);
		}
		
		return sb[0].toString();
	}
}

