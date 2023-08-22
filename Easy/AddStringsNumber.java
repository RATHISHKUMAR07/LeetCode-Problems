package Easy;

public class AddStringsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String addStrings(String num1, String num2) {
		StringBuilder str = new StringBuilder();

		if (num1.length() > num2.length()) {
			num2 = "0".repeat(num1.length() - num2.length()) + num2;
		} 
		else if (num2.length() > num1.length()) {
			num1 = "0".repeat(num2.length() - num1.length()) + num1;
		}

		int carry = 0;
		int n = num1.charAt(0) - '0' + num2.charAt(0) - '0';

		if (num1.length() == 1) {
			str.append(Integer.toString(n));
		} 
		else {
			for (int i = num1.length() - 1; i >= 0; i--) {
				n = num1.charAt(i) - '0' + num2.charAt(i) - '0';
				if (carry == 1) {
					n = carry + n;
					carry = 0;
					if (n > 9) {
						carry = 1;
						if (i == 0) {
							str.append(Integer.toString(n%10));
							str.append(Integer.toString(n/10));
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
			}
		}

        if(num1.length() != 1)
		    str.reverse();

		return String.valueOf(str);
    }
}
