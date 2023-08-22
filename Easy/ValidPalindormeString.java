package Easy;

public class ValidPalindormeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isPalindrome(String s) {
        if(s==null){
            return false;
        }
        String str = "";
        String str1 = "";
        s = s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if(((int)s.charAt(i) > 96 && (int)s.charAt(i) < 123)){
                str = str + s.charAt(i);
                str1 = s.charAt(i) + str1;
            }
            else if( ((int)s.charAt(i) > 47 && (int)s.charAt(i) < 58)){
                str = str + s.charAt(i);
                str1 = s.charAt(i) + str1;
            }
        }
        if(str.equals(str1)){
            return true;
        }
        return false;
    }

}
