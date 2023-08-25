package Medium;

public class CountAndSay {
	public static void main(String[] args) {
		System.out.println(countAndSay(5));

	}
	public static String countAndSay(int n) {
		String s = "1";
		if(n == 1)
			return s;
		for(int i=1;i<n;i++) {
			s = sayEach(s);
		}
		return s;
	}
	
	public static String sayEach(String s) {
		int len = s.length();
		StringBuilder sb = new StringBuilder();
		char c = s.charAt(0);
		int count = 1;
		for(int i=1;i<len;i++) {
			if(c == s.charAt(i))
			{
				count++;
			}
			else {
				sb.append(count);
				sb.append(c);
				c = s.charAt(i);
				count = 1;
			}
		}
        System.out.println("Before ="+sb);
		sb.append(count);
        sb.append(c);
        System.out.println("After="+sb);
		return sb.toString();
	}


}
