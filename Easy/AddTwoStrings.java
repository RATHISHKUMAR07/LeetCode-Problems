package Easy;
public class AddTwoStrings {

	public static void main(String[] args) {
		System.out.println(addStrings("3876620623801494171", "6529364523802684779"));
	}

	public static String addStrings(String num1, String num2) {
		StringBuilder str = new StringBuilder();
		int l1 = num1.length();
		int l2 = num2.length();
		if (l1 > l2) {
			num2 = "0".repeat(l1 - l2) + num2;
		} 
		else if (l2 > l1) {
			num1 = "0".repeat(l2 - l1) + num1;
		}
		int len = num1.length();
		int carry = 0;
		int n = 0;
		n = num1.charAt(0) - '0' + num2.charAt(0) - '0';
		if (len == 1) {
			str.append(Integer.toString(n));
		} 
		else {
			for (int i = len - 1; i >= 0; i--) {
				n = num1.charAt(i) - '0' + num2.charAt(i) - '0';

				if (carry == 1) {
					n = carry + n;
					carry = 0;
					if (n > 9) {
						carry = 1;
						if (i == 0) {
							str.append(Integer.toString(n%10));
							str.append(Integer.toString(n/10));
							System.out.println("Finala - " + str );
						} 
						else {
							str.append(Integer.toString(n % 10));
						}
					} 
					else {
						str.append(Integer.toString(n));
					}
				} 
				else {
					if (n > 9) {
						if(i == 0){
                            str.append(Integer.toString(n%10));
							str.append(Integer.toString(n/10));
                        }
                        else {
							str.append(Integer.toString(n%10));
							carry = 1;
						}
					} 
					else {
						str.append(Integer.toString(n));
						carry = 0;
					}
				}
				System.out.println(str);
			}
		}
        if(len != 1)
		    str.reverse();
		return String.valueOf(str);
	}

}
